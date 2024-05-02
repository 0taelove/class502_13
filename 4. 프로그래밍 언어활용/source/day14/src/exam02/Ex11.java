package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(60, 78, 99, 67, 100); // 일반 스트림, 참조 자료형, 배열만 가능
        // Stream<Integer>, 숫자 기능이 없음
        long sum = scores.stream().mapToInt(x -> x).sum(); // 숫자 형태의 기본 자료형 스트링으로 변환
        System.out.println(sum); // 404
    }
}
