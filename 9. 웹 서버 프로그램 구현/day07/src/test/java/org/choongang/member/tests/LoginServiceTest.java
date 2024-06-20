package org.choongang.member.tests;

import org.choongang.member.services.LoginService;
import org.choongang.member.services.MemberServiceProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {

    private LoginService loginService;

    // 매번 테스트시마다 객체를 생성하지 않게 테스트 전 공통자원으로 설정
    // 객체 조립기를 통해 테스트 전에 객체를 불러올 수 있도록 설정 -> MemberServiceProvider쪽에서
    @BeforeEach
    void init() {
        loginService = MemberServiceProvider.getInstance().loginService();

    }

    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void successTest() {
        // assertDoesNotThrow 내가 테스트하는 코드가 오류가 있는지 없는지를 테스트
        // 람다식으로 정의
        assertDoesNotThrow(() -> {
            LoginService loginService = new LoginService();
            loginService.process();
        });
    }
}
