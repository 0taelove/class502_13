package org.choongang.global.validators;

// 필수 항목 검증이 제일 많아서 공통적인 인터페이스로 정의
// 값이 있는지 없는지 체크
public interface RequiredValidator {
    default void checkRequired(String str, RuntimeException e) {
        System.out.println("str=" + str);
        if (str == null || str.isBlank()) {
            throw e;
        }
    }

    // 참인지 체크
    default void checkTrue(boolean checked, RuntimeException e) {
        if (!checked) {
            throw e;
        }
    }
}
