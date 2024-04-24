package exam04;

public class UserIdException extends RuntimeException {
    // Exception을 상속받음으로서 예외를 처리할 수 있게 된다

    public UserIdException(String message) {
        super(message); // super로 상위 클래스에 있는 생성자에게 처리 요청
    }
}
