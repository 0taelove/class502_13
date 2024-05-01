package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums1 = { 10, 20, 30, 40, 50, 60 };
        int[] nums2 = Arrays.copyOf(nums1, 3);
        int[] nums3 = Arrays.copyOfRange(nums1, 1, 5); // 1, 2, 3, 4
        System.out.println(nums1); // 호출시 배열은 시작 주소가 나옴
        // 배열의 값 확인
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }
}
