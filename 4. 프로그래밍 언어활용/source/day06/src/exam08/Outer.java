package exam08;

public class Outer {
    int num1 = 10; // Outer 객체의 인스턴스 자원

    class Inner { // 인스턴스 내부 클래스
        int num1 = 15; // Inner 객체의 인스턴스 자원
        int num2 = 20; // Inner 객체의 인스턴스 자원
        static int num3 = 30;

        public void method() {
            // Outer.this // 외부 클래스의 객체 자원에 접근하는 정적 변수로 this가 추가되어 있음
            System.out.println("인스턴스 내부 클래스에서 호출");
            System.out.printf("num1 + num2 = %d\n", Outer.this.num1 + this.num2);
            // 기본적으로 this가 생략되어 있음
        }
    }
}
