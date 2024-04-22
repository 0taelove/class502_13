package exam08;

public class Ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        // 외부 클래스의 객체가 되어야만 인스턴스 자원으로서 객체가 생성되고 이후 접근이 가능
        inner.method();
        System.out.println(Outer.Inner.num3);
    }
}
