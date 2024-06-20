package org.choongang.member.validators;

import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.RequiredValidator;
import org.choongang.global.validators.Validator;

// http프로토콜의 request정보를 서블릿에게 전달하기 위해 사용
// 필수 항목 검증 인터페이스 RequiredValidator 구현
public class LoginValidator implements Validator<HttpServletRequest>, RequiredValidator {

    // 사용자가 보내주는 데이터를 가져옴
    @Override
    public void check(HttpServletRequest form) {
        String email = form.getParameter("email");
        String password = form.getParameter("password");

        // 필수 항목 검증
        checkRequired(email, new BadRequestException("이메일을 입력하세요."));
        checkRequired(password, new BadRequestException("비밀번호를 입력하세요."));
    }
}
