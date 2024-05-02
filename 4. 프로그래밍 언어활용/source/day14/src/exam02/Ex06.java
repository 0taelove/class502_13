package exam02;

import java.util.function.IntUnaryOperator;

public class Ex06 {
    public static void main(String[] args) {

    }

    // Stream 기본 탑재 for문 내부 구조
    // 추상메서드, 정의된 것이 없음
    // 사용자 정의 기능 하기 위함
    public static int[] map(int[] nums, IntUnaryOperator oper) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = oper.applyAsInt(nums[i]);
        }

        return newNums;
    }
}
