package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = IntStream.generate(() -> 1).limit(10).toArray(); // 매개변수가 없는 형태
        System.out.println(Arrays.toString(nums));
    }
}
