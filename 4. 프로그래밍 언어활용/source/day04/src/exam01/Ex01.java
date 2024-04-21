package exam01;

public class Ex01 {
    public static void main(String[] args) {

        Board b1 = Board.getInstance();
        Board b2 = Board.getInstance();
        System.out.println(b1 == b2);
        System.out.println("b1 주소 :" + System.identityHashCode(b1));
        System.out.println("b2 주소 :" + System.identityHashCode(b2));
        // static으로 하나의 객체를 공유하기 때문에 b1, b2 -> 동일한 주소
    }
}
