package exam03;

public class Ex01 {
    public static void main(String[] args) {
        try(Resources res = new Resources()) { // auto.close를 호출한다
            // res가 AutoClosable 인터페이스 구현 객체인지 체크
            // -> close() 메서드가 자동 호출

            /* 생략 가능
            AutoCloseable auto = res; // 자원 해제를 자동화
            auto.close();
            */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
