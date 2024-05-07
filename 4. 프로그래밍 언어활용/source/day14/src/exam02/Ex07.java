package exam02;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        int[] nums2 = map(nums, new IntUnaryOperator() {

            @Override
            public int applyAsInt(int num) { // applyAsInt 사용자 정의 기능
                return num * num; // -> nums.length; 내부에서 호출 중
            }
        });
        System.out.println(Arrays.toString(nums2));
    }

    // 함수형 인터페이스 정의시 거의 다 사용자 정의 기능, 내부에서 호출해주고 값만 제공
    // 그 기능을 갖고 하는 건 개발자의 자유
    // map은 역할 추상 메서드(함수만) 호출, 재료가 되는 값만 넘겨줌
    public static int[] map(int[] nums, IntUnaryOperator oper) {
        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) { // 값 대입
            newNums[i] = oper.applyAsInt(nums[i]);
        }

        return newNums;

    }
}
// IntUnaryOperator 인터페이스 -> 추상 메서드 정의되어 있음
// 추상메서드는 수행 내용이 명확하지 않음 -> 틀만 정해뒀기 때문
// 함수형 인터페이스에도 추상 메서드가 정의되어 있음
// 사용자 정의 기능을 위해서
// 이 정의는 상황에 따라 바뀔 수 있다
// 인터페이스가 객체가 되는 조건으로 public int applyAsInt 정의한 대로 수행함
// map은 역할 추상 메서드(함수만) 호출, 재료가 되는 값만 넘겨줌
// for (int i = 0; i < nums.length; i++) { // 값 대입