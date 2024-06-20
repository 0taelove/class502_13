package org.choongang.member.validators;

import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.validators.RequiredValidator;
import org.choongang.global.validators.Validator;

// http프로토콜의 request정보를 서블릿에게 전달하기 위해 사용
// 필수 항목 검증 인터페이스 RequiredValidator 구현
public class LoginValidator implements Validator<HttpServletRequest>, RequiredValidator {

    @Override
    public void check(HttpServletRequest form) {

    }
}
