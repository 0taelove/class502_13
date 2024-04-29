package exam03;

public class Box<T> {

    private T item;

    // Box가 객체가 될 때 T가 결정
    public void method1(T str1, T str2) { // 지네릭 클래스의 자료형은 T

    }

    // 지네릭 메서드 - 호출시의 T의 자료형이 결정 된다. 지네릭 메서드 T
    public <T> void method2(T str1, T str2) {

    }
}
