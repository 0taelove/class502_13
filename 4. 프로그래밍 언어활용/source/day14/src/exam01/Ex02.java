package exam01;

import java.util.function.BiFunction;

public class Ex02 {
    public static void main(String[] args) { // 지네릭스에는 참조 자료형, 배열만 가능
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b;
        int result = calc.apply(10, 20);
        System.out.println(result);

        /**
         * 1. 연산은 기본형만 가능, 객체인 Integer -> int (언박싱), 반환값 Integer로 변환 (오토박싱), int result로 변환 (언박싱) -> 성능 저하, 연산은 그냥 기본형으로 하는게 좋다!
         * 2. Integer 자료형 반복 // Integer calss는 wrapper calss 이다
         */
    }
}
