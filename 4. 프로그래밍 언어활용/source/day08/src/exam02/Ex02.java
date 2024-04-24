package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = "ABC"; // 힙영역 - 문자열 상수 풀, 문자열 상수
        String s2 = "ABC"; // 힙영역 - 문자열 상수 풀, 문자열 상수
        // 리터럴 상수 - ABC 라는 문자열이 달라질 게 없음 -> String 객체의 객체의 문자열 상수
        System.out.printf("s1 == s2: %s%n", s1 == s2);
        System.out.printf("s1 주소: %d%n", System.identityHashCode(s1));
        System.out.printf("s1 주소: %d%n", System.identityHashCode(s2));
    }
}
