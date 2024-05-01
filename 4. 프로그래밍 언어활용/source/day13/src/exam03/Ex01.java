package exam03;

import java.util.function.BiFunction;

public class Ex01 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b;
        int result = calc.apply(10, 20);
        // 오토박싱과 언방식을 반복함
        // Integer 객체를 쓸 게 아니라 처음부터 기본형을 사용하는 게 효율적
        // Integer 반복중
        System.out.println(result);
    }
}
