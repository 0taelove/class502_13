package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9, 11, 13, 14 };
        // 모든 조건이 참(홀수)인 경우
        boolean isOdd = Arrays.stream(nums).allMatch(x -> x % 2 == 1);
        System.out.println(isOdd); // false

        // 어떤 조건이든 하나라도 참(짝수)인 경우
        boolean isEven = Arrays.stream(nums).anyMatch(x -> x % 2 == 0);
        System.out.println(isEven); // true

        // 모든 조건이 거짓(짝수 반대)인 경우
        boolean notIncludeEven = Arrays.stream(nums).noneMatch(x -> x % 2 == 0);
        System.out.println(notIncludeEven); // false
    }
}
