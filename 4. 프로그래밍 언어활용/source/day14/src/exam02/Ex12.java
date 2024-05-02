package exam02;

import java.util.Arrays;
import java.util.Comparator;

public class Ex12 {
    public static void main(String[] args) {
        int[] nums = { 33, 10, 5, 1, 3, 88, 100, 10 };
        int[] nums2 = Arrays.stream(nums).sorted().toArray(); // 기본 자료형 스트림
        System.out.println(Arrays.toString(nums2));

        // Stream<Integer> 로 변환되어 있음
        // 기본 스트림에 없는 메서드를 사용하기 위해 boxed로 일반 스트림을 변환시킴
        int[] nums3 = Arrays.stream(nums).boxed() // 일반 스트림으로 변환
                            .sorted(Comparator.reverseOrder()) // 정렬 기준 변경 가능
                            .mapToInt(x -> x)
                            .toArray();
        System.out.println(Arrays.toString(nums3));
    }
}
