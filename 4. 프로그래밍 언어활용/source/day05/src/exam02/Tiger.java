package exam02;

public class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("네발로 뛰어다닌다");
    }

    public void hunting() {
        System.out.println("사냥을 한다.");
    }
    /*
    @Override
    public void move() {
        super.move(); // super 현재의 상위 클래스 객체의 주소값
    }*/
}
