package exam01;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        // 100개의 무작위 난수 발생
        // 짝수가 아닌 경우에도 출력이 가능하게 바꿔줌
        Random rand = new Random();
        int firstOdd = rand.ints(100)
                            .filter(x -> x % 2 == 1)
                            .findFirst()
                            .orElse(-1);
        System.out.println(firstOdd);
    }
}
