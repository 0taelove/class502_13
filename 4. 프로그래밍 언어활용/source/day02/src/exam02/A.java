package exam02;

public class A {
    public int numA;
    int numAA; // default 접근 제어자, 동일 패키지에서만 접근 가능

    private int numAAA; // class 내부의 {} 안에서만 접근 가능

    protected int numB;

    void printNum() {
        numAAA = 100;
        System.out.println(numAAA);
    }
}
