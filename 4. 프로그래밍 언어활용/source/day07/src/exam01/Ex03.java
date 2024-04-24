package exam01;

public class Ex03 {
    public static void main(String[] args) {
        // int num3 = 30;
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                // num3 = 50; 지역 변수의 상수화 final int num3
                return num1 + num2; //num3; // num3의 값을 사용하고 있어서 지역 변수가 아니게 됨
            } // {}를 통해 객체를 만드는 과정에서 메서드를 재정의
            // 인터페이스나 추상 메서드가 아닌 일반 클래스라도 상속 없이 재정의가 가능
        };

        // Calculaotr cal2 = (x, y) -> x + y; 람다식으로 짧게 표현
    }
}
