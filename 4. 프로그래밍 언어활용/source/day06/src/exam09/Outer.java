package exam09;

public class Outer{
    int num1 = 10;
    static int num2 = 20;

    static class Inner {
        public void method() {
            System.out.println("정적 내부 클래스에서 호출!");
            // System.out.println(num1); // this가 없어서 instance 자원에 접근 불가
            // 즉, Outer 클래스의 객체가 되던 관련X, 접근 X
            System.out.println(num2); // 객체랑 상관 없기 때문에 접근 가능
        }
    }
}
