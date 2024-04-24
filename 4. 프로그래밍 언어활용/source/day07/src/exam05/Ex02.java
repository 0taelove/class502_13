package exam05;

public class Ex02 {
    public static void main(String[] args) {
        Object[] humans = new Object[2]; // Human[]은 X Object[]는 최상위 클래스로 가능
        humans[0] = new Human();
        humans[1] = new Tiger();
    }
}
