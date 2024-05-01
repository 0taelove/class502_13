package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // 다차원 배열시 배열의 주소값이 나옴
        int[][] nums1 = {{10, 20, 30}, {40, 50, 60}};
        // System.out.println(Arrays.toString(nums1)); // [[I@4eec7777, [I@3b07d329]
        System.out.println(Arrays.deepToString(nums1));
    }
}
