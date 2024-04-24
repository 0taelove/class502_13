package exam02;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; // ArithmeticException

            String str = null;
            System.out.println(str.toUpperCase()); // NullPointerException
            // 해당 참조가 없을 때 해당 객체의 자원에 접근한다

            System.out.println(result);
        } catch (ArithmeticException | NullPointerException e) { // 처리 기능이 같을 때는 붙여서 다중처리 가능
            e.printStackTrace();

        }
        System.out.println("매우 중요한 코드...");
    }
}
