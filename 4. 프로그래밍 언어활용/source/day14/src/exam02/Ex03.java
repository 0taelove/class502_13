package exam02;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        /**
         * 1. 문자열 앞 뒤로 *...*
         * 2. 대문자 변환
         * 3. 출력
         */
        String[] fruits = { "apple", "orange", "mango", "melon" };
        // stream객체 생성, map 변환작업(interface 매개변수, 투입 -> 나가는 형태 function)
        Arrays.stream(fruits).map(s -> "*" + s + "*")
                            .map(String::toUpperCase)
                            .forEach(System.out::println);
    }
}
