package exam03;

public class Ex05 {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = Integer.valueOf(200);
        // 원래면 기본형만 연산이 가능
        // 객체끼리 연산이 되면 안 되지만

        int result1 = num1 + num2.intValue(); // intValue가 자동적으로 일어남
        System.out.println(result1);
        // 객체 -> 기본형으로 자동 형 변환이 일어남(컴파일러가 해줌) -> 가능해짐

        Integer num3 = Integer.valueOf(100);
        Integer num4 = Integer.valueOf(200);
        
        int result2 = num3 + num4.intValue(); // intValue가 자동적으로 일어남
        System.out.println(result2);
    }
}
