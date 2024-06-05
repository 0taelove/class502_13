package globals.exceptions;

public class ValidationException extends RuntimeException { // 유연한 예외
    public ValidationException(String message) {
        super(message); // 생성자 매개변수로 message 정의 가능
    }
}
