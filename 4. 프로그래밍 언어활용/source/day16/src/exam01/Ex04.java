package exam01;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] scores = { 67, 80, 100, 98, 76, 56 };

        // 최대값 반환하는 방법 -> a, b 비교 후 클 때는 a 반환, 작을 때는 b 반환
        int max = Arrays.stream(scores)
                        // .reduce((a, b) -> a > b ? a : b)
                        .reduce((a, b) -> {
                            System.out.printf("a=%d, b=%d%n", a, b);

                            int m = a > b ? a : b;
                            return m;
                        })
                        .getAsInt();
        System.out.println(max); // 100
    }
}
