package exam09;

public class Ex01 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        // 객체 생성 없이 기능을 바로 호출하여 실행한다.
        // this가 없다 -> 객체의 주소를 참조해볼 수 있는 수단이 없다 -> 객체 자원 접근 불가
        // instance 메서드나 멤버 변수를 호출할 수 없다 -> this가 없기 때문
        inner.method();
    }
}
