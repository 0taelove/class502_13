package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex12 {
    public static void main(String[] args) {
        // List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50, 60);
        // Stream<Integer> -> mapToInt -> IntStream
        // 메서드 살펴보면 일반 스트림에 정의된 것만 있어서 sum이 없다
        // long total = nums.stream().mapToInt(x -> x.intValue()).sum();
        /*
        숫자와 관련된(int, ling, double) 연산은 기본형이 가장 좋음 처음부터 IntStream을 쓰는 게
        형변환 필요 X, 작업 효율 증진에 좋음
        -> IntStream로 바꿔주면 합계를 구할 수 있는 sum 메서드 정의되어 잇음 maptoInt
         */
        int[] nums = { 10, 20, 30, 40, 50, 60 };
        // IntStream
        long total = Arrays.stream(nums).sum();
    }
}
