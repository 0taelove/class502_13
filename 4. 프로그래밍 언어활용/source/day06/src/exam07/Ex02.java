package exam07;

public class Ex02 {
    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        ex01.method();
        // 여러개 메서드가 중복되어 정의되어 있더라도 실행의 주체가 Ex01에
        // 정의 된 메서드이기 때문에 구현채가 있는 Ex01의 메서드가 실행된다
    }
}
