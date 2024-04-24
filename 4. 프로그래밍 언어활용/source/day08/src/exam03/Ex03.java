package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(100000);
        Integer num2 = Integer.valueOf(100000);

        System.out.printf("num1 주소: %d%n", System.identityHashCode(num1));
        System.out.printf("num1 주소: %d%n", System.identityHashCode(num2));
        // 다른 주소 다른 객체 -> 같은 재료를 담은 객체를 여러 개 만들 필요가 없음...
        // 재료의 숫자가 커지게 되면 객체가 계속 생성 됨
    }
}