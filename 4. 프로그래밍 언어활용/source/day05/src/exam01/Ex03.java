package exam01;

public class Ex03 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c instanceof C); // prototype 체크
        System.out.println(c instanceof B);
        System.out.println(c instanceof A);
        // c는 C로부터 상속받았고 C는 B와 A를 포함하고 있기 때문에 c는 ABD와 주소값이 같다
    }
}
