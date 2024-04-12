package exam01;

public class Ex11 {
    public static void main(String[] args) {
        double num1 = 10.123;
        // long num2 = num1; // 실수 -> 정수XX 데이터 유실 됨
        long num2 = (long)num1; // 명시적 형변환 소수점 유실 됨
        System.out.println(num2);
    }
}
