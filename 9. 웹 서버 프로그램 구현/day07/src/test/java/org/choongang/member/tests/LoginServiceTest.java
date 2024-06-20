package org.choongang.member.tests;

import com.github.javafaker.Faker;
import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.LoginService;
import org.choongang.member.services.MemberServiceProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {

    // 여러 곳에서 사용하기 위해 멤버 변수 형태로 정의
    private LoginService loginService;
    // faker 객체 자주 사용할 거 같아서 모의 객체 faker 생성
    private Faker faker;
    // 성공시 생각하는 데이터 -> 스텁 만들기
    private RequestJoin form;

    // 가짜 데이터
    @Mock
    private HttpServletRequest request;

    // 매번 테스트시마다 객체를 생성하지 않게 테스트 전 공통자원으로 설정
    // 객체 조립기를 통해 테스트 전에 객체를 불러올 수 있도록 설정 -> MemberServiceProvider쪽에서
    @BeforeEach
    void init() {
        loginService = MemberServiceProvider.getInstance().loginService();

        // 회원가입...?
        JoinService joinService = MemberServiceProvider.getInstance().joinService();

        // 가짜 데이터 영어로 생성
        faker = new Faker(Locale.ENGLISH);

        // 회원 가입 -> 가입한 회원 정보로 email, password 스텁 생성
        form = RequestJoin.builder()
                        .email(System.currentTimeMillis() + faker.internet()
                        .emailAddress())
                        .password(faker.regexify("\\w{8,16}").toLowerCase())
                        .userName(faker.name().fullName())
                        .termsAgree(true)
                        .build();
        form.setConfirmPassword(form.getPassword());

        joinService.process(form);

        // 검증할 때 1번 호출
        setData();
    }

    // 데이터를 초기화 할 필요가 있음
    // 분리한 이유 -> 비번 검증시 이메일 필요.. 값 초기화 -> 교체 목적
    // form에 정의한 메서드를 호출하여 바로 검증으로 변경
    void setData() {
        setParam("email", form.getEmail());
        setParam("password", form.getPassword());
    }

    // 가짜 데이터
    // 사용자 요청한 데이터가 들어와야 함
    // getattribute -> 서버가 보내주는 데이터 - 속성, 뷰 출력 목적
    // getparameter -> 사용자가 보내주는 데이터
    void setParam(String name, String value) {
        given(request.getParameter(name)).willReturn(value);
    }

    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void successTest() {
    // assertDoesNotThrow 내가 테스트하는 코드가 오류가 있는지 없는지를 테스트
    // 람다식으로 정의
    assertDoesNotThrow(() -> {
            loginService.process(request);
        });
    }

    @Test
    @DisplayName("필수 입력 항목(이메일, 비밀번호) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFieldTest() {
        assertAll(
                () -> requiredEachFieldTest("email", false, "이메일"),
                () -> requiredEachFieldTest("email", true, "이메일"),
                () -> requiredEachFieldTest("password", false, "비밀번호"),
                () -> requiredEachFieldTest("password", true, "비밀번호")
        );

    }

    void requiredEachFieldTest(String name, boolean isNull, String message) {
        setData(); // 이메일과 비밀번호가 들어갈 수 있게 초기화
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
            if (name.equals("password")) {
                setParam("password", isNull ? null : "   ");
            } else { // 이메일
                setParam("email", isNull ? null : "   ");
            }

            loginService.process(request);
        }, name + " 테스트 ");

        String msg = thrown.getMessage();
        assertTrue(msg.contains(message), name + ", 키워드:" + message + "테스트");
    }

    @Test
    @DisplayName("이메일로 회원이 조회되는지 검증, 검증 실패시 BadRequestException 발생")
    void memberExistTest() {

    }
}
