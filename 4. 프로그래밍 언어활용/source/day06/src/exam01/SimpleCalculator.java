package exam01;

public class SimpleCalculator extends Calculator {

    public SimpleCalculator() {
        super();
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
    // 상위 클래스인 Calculator의 commonMethod에 final이 붙음으로 재정의 불가가 됨
    /*public void commonMethod() {
    }*/
}
