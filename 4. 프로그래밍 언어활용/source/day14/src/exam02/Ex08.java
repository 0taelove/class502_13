package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex08 {
    public static void main(String[] args) {
        int[] nums = { 22, 11, 10, 2, 6, 8, 33 };
        // filter : true -> 통과 O, fals -> 통과X
        Arrays.stream(nums).map(x -> x * x).filter(x -> x % 2 == 1).forEach(System.out::println);

        // stream은 대부분 연속된 작업을 염두해 두고 정의함
        // IntStream stm1 = Arrays.stream(nums);
        // stm1.map(x -> x * x).filter(x -> x % 2 == 1).forEach(System.out::println);
        // IntStream stm2 = stm1.map(x -> x * x).filter(x -> x % 2 == 1);
        // IntStream stm3 = stm2.filter(x -> x % 2 == 1); 위에 .으로 합쳐도 됨
        // forEach 또한 stm1.map(x -> x * x)로 합쳐도 됨

    }
}
