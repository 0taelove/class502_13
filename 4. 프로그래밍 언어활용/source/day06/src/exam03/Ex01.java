package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new SimpleCalculator(); // 다형성(포함되어 있기 때문)
        int result = cal.add(10, 20);
        System.out.println(result);

        System.out.println(Calculator.NUM); // 정적 상수
    }
}
