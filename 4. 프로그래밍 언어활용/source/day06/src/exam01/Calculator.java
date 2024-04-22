package exam01;

public abstract class Calculator {
    int num = 10;

    public Calculator() {
        System.out.println("Calculator 생성자!");
    }

    public abstract int add(int num1, int num2);
    // 추상 메서드(설계원칙), 공통적으로 공유할 기능들 정의 but 둘 중 1개만 사용하는 경우도 있음
    // 굳이 사용하지 않아도 됨

    public final void commonMethod() {

    }
}
