package exam01;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random rand = new Random();

        // rand.ints(6).forEach(x -> System.out.println(x)); // 갯수 제한 안 하면 서버 다운
        rand.ints(6).forEach(System.out::println); // 메서드 참조형
        // rand.ints().limit(6).forEach(System.out::println); // 위와 동일

    }
}
