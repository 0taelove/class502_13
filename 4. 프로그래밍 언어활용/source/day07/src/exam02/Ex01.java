package exam02;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; // ArithmeticException

            String str = null;
            System.out.println(str.toUpperCase()); // NullPointerException
            // 해당 참조가 없을 때 해당 객체의 자원에 접근한다

            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (Exception e) { // 다형성이 적용 된다
            // 가장 상위 클래스인 Exception은 가장 아래쪽에 정의한다
            // 예외 상황에서 또 다른 예외를 처리하기 위함
            System.out.println("유입!");
            e.printStackTrace(); // 다중 처리

        }
            System.out.println("매우 중요한 코드...");
    }
}
