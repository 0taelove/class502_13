package exam03;

public interface Calculator {
    // 추상 메서드에는 정의만 하면 오류가 나서 abstract가 필요했는데 얘는 오류가 안 남
    int NUM = 10; // public static final 자동 추가 // 정적 상수 -> 객체를 만들지 않고 접근 가능한 형태
    int add(int num1, int num2); // interface의 목적 자체가 설계이기 때문에 public abstract가 자동으로 추가
        //return num1 + num2; // 메서드는 추상 메서드로 설계를 위한 건데 기능이 정의되어 있으니 오히려 오류가 남
}
