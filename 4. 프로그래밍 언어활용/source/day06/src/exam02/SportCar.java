package exam02;

public class SportCar extends Car {
    // 상위 클래스인 Car에 final이 붙음으로 재정의 불가가 됨
    public void start() {
        System.out.println("시동 걸기");
    }

    public void press() {
        System.out.println("악셀레이터 밟고");
    }

    public void turnoff() {
        System.out.println("시동 끄기");
    }

    /* public void run() {

    }
     */
}