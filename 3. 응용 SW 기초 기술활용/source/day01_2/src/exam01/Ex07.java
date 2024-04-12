package exam01;

public class Ex07 {
    public static void main(String[] args) {
        long num1 = 10_000_000_000L; // int (4byte)
        // long일 경우 가독성을 위해 _를 붙여주기도 한다

        byte num2 = 100; // int던지고(인식) -> byte로 바꿔주는 작업
        // 처음부터 int로 선언해주는 게 효율적인 자바 자료형

        // float num3 = 100.123; // double(8byte) -> float로 바꿔줌
        float num4 = 100.123F; // F -> 처음부터 4바이트 float로 공간 할당
    }
}
