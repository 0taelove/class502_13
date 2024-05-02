package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Orange", "Apple", "banana", "Melon", "Mango" };
        /**
         * 1. 중복제거
         * 2. 문자열 길이 변경(String -> int : mapToInt : String -> int
         * 3. int[] 배열로 변경
         */

        // 메서드 참조로 짧은 구문 사용
        // 중간연산 .distinct().mapToInt
        // 최종연산 .toArray();
        int[] nums = Arrays.stream(fruits)
                            .distinct()
                            .mapToInt(String::length)
                            .toArray();
        System.out.println(Arrays.toString(nums));
    }
}
