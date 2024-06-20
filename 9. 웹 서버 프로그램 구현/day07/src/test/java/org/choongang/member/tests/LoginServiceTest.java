package org.choongang.member.tests;

import com.github.javafaker.Faker;
import jakarta.servlet.http.HttpServletRequest;
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

    private LoginService loginService;
    // faker 객체 자주 사용할 거 같아서 모의 객체 faker 생성
    private Faker faker;

    // 가짜 데이터
    @Mock
    private HttpServletRequest request;

    // 매번 테스트시마다 객체를 생성하지 않게 테스트 전 공통자원으로 설정
    // 객체 조립기를 통해 테스트 전에 객체를 불러올 수 있도록 설정 -> MemberServiceProvider쪽에서
    @BeforeEach
    void init() {
        loginService = MemberServiceProvider.getInstance().loginService();

        // 가짜 데이터 영어로 생성
        faker = new Faker(Locale.ENGLISH);

        setParam("email", faker.internet().emailAddress());
        setParam("password", faker.regexify("\\w{8}").toLowerCase());
    }

    // 가짜 데이터
    void setParam(String name, String value) {
        given(request.getParameter(name)).willReturn(value);
    }

    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void successTest() {
    // assertDoesNotThrow 내가 테스트하는 코드가 오류가 있는지 없는지를 테스트
    // 람다식으로 정의
    assertDoesNotThrow(() -> {
            loginService.process();
        });
    }

    @Test
    @DisplayName("필수 입력 항목(이메일, 비밀번호) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFieldTest() {
        // 사용자 요청한 데이터가 들어와야 함
        // getattribute -> 서버가 보내주는 데이터 - 속성, 뷰 출력 목적
        // getparameter -> 사용자가 보내주는 데이터
    }
}
