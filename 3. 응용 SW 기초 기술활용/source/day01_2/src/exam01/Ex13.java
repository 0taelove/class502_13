package exam01;

public class Ex13 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 2.5;

        int num3 = num1 * (int)num2;
        // 연산은 무조건 같은 자료형끼리만 가능
        // int num1 -> double로 묵시적 형변환
    }
}
