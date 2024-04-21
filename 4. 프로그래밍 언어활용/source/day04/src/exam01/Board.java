package exam01;

import java.security.cert.X509Certificate;

public class Board {
    // 외부에서 접근이 안 되기 때문에 내부에서 객체를 생성해줘야 한다
    // static으로 이렇게 만들면 비효율적 싱글톤 패턴으로 만들어주기
    // private static Board instance = new Board(); // 클래스 로드 시점부터 객체 생성
    private static Board instance;

    static {
        System.out.println("처음부터 실행, 객체생성과 관련 없이");
    }

    private Board() {} // 통제 가능하게 private로 접근자 제어 (외부에서 접근 불가)

    // 내부에서 객체를 만들고 외부에서 접근할 수 있게 함수 형태로 만들어줘야 한다
    // static 메서드로 객체와 상관없이 접근가능하게 해줘야 함
    // 하지만 static은 this가 없어 정적자원만 접근 가능하기 때문에 static으로 정의 해줘야 한다(위도)
    public static Board getInstance() {
        if (instance == null) { // 필요한 시점 최소 1번만 생성
            instance = new Board();
        }
        return instance;
    }
}