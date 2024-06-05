package member.validators;

import globals.exceptions.ValidationException;
import globals.validators.RequiredValidator;
import globals.validators.Validator;
import member.controllers.RequestJoin;

public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {

    @Override
    public void check(RequestJoin form) {
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean termsAgree = form.isTermsAgree();

        /* 필수 항목 검증 S */
        checkRequired(email, new ValidationException("이메일을 입력하세요."));
        checkRequired(password, new ValidationException("비밀번호를 입력하세요."));
        checkRequired(confirmPassword, new ValidationException("비밀번호를 확인하세요."));
        checkRequired(userName, new ValidationException("회원명을 입력하세요"));
        checkTrue(termsAgree, new ValidationException("약관에 동의하세요."));
        /* 필수 항목 검증 E */
    }
}
