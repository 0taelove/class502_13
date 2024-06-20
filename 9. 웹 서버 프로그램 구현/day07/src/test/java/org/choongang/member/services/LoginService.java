package org.choongang.member.services;

import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.validators.Validator;

// 개방폐쇄원칙
public class LoginService {

    private Validator<HttpServletRequest> validator;

    public LoginService(Validator<HttpServletRequest> validator) {
        this.validator = validator;
    }

    public void process(HttpServletRequest request) {

    }
}
