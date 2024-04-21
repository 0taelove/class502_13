package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = {new Human(), new Bird(), new Tiger()};
        // Animal[] animals = new Animal[3];
        // animals[0] = new Human()
        // animals[1] = new Bird();
        // animals[2] = new Tiger();

        for (Animal animal : animals) {
            animal.move();
            // 각각의 본체에서 정의된 메서드와 매핑되어 호출 한다.

            // 타이거 휴먼을 사용하려면 원래 객체만큼 범위가 넓혀야 한다 형변환 -> 애니멀이 다시 호랑이
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.reading();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
                // animal이어도 다 같은 게 아니기 때문(3개가 있음)에 insetanceof로 자원의 출처를
                // 분명히 명시하고 조건문을 사용해줘야 에러가 나지 않는다.
            }
        }
    }
}
