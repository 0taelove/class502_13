package exam02;

public abstract class Car {
    public abstract void start();
    public abstract void press();
    public abstract void turnoff();

    public final void run() { // 템플릿 메서드 패턴, 실행 순서를 정의, 메서드 못 바꾸게 정의 final사용
        start();
        press();
        turnoff();
    }
}
