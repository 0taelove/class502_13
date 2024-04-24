package exam03;

public class Ex07 {
    public static void main(String[] args) {
        double result = add(10.0, 10L);
        System.out.println(result);
    }

    public static double add(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
        // 코드를 작성할 때 투입되는 값이 정수일지 실수일지 아직 모를 때 반환값을 num로 정의
    }
}
