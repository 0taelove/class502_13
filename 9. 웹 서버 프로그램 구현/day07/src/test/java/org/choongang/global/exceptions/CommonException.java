package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletResponse;

public class CommonException extends RuntimeException {

    private int status; // 응답 코드

    // 메세지를 기본 500이 아닌 상수 형태로 정의하여 설정한 코드대로 출력할 수 있게 해줌(BadRequestException)
    public CommonException(String message) {
        this(message, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }

    public CommonException(String message, int status) {
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
