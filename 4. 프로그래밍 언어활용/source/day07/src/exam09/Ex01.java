package exam09;

public class Ex01 {
    public static void main(String[] args) {
        Animal human = new Human();
        Human human2 = (Human)human;
        System.out.println("h1" + System.identityHashCode(human));
        System.out.println("h2" + System.identityHashCode(human2));

        Animal tiger = new Tiger();

    }
}
