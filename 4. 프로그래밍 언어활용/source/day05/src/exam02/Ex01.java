package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human(); // Human -> Animal class도 가능
        // human.move();

        Tiger tiger = new Tiger(); // Tiger -> Animal class도 가능
        // tiger.move();

        Bird bird = new Bird(); // Bird -> Animal class도 가능
        // bird.move();
        // 세 개 다 같은 값 -> 여러 데이터를 한 곳에 담는다 -> 배열

        // 동일한 자료형으로, 순차 자료형 형태로 but 다 다른 자료형임...
        //Human[] animals = new Human[30;
        Animal[] animals = new Animal[3];
        animals[0] = human; // Animal animals[0] = human;
        animals[1] = tiger; // Animal animals[0] = tiger;
        animals[2] = bird; // Animal animals[0] = bird;

        /*
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
            */

        // 위 코드 보다는 향상된 for문으로 사용해주기
        for (Animal animal : animals) {
            animal.move();
        }
    }
}
