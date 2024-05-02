package exam01;

import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {
        // 함수 두개를 연속해서 1개의 기능 구현(함수의 합성) 문자 길이 -> 제곱
        Function<String, Integer> func1 = s -> s.length(); // 문자열 길이
        Function<Integer, Integer> func2 = x -> x * x; // 제곱 기능
        Function<String, Integer> func3 = func1.andThen(func2);
        Function<String, Integer> func4 = func2.compose(func1); // func1 -> func2

        int num = func3.apply("가나다"); // 가나다 -> 3 -> 9
        System.out.println(num); // 9
        // int len = func1.apply("가나다");
        // System.out.println(len); // 3
    }
}
