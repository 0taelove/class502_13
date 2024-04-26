package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple()); // 생성과 동시에 대입, apple 다형성으로 오브젝트가 다 될 수 있음

        // 매개변수, 반환값의 자료형이 Object면 다양하게 수용가능
        // 현재 Object로 범위가 좁혀져 있어서 명시적 형 변환이 필요 (다운 캐스팅)
        Apple apple = (Apple)appleBox.getItem(); // 1) 형 변환의 번거로움
        // Box의 반환값은 apple이 아니라 Object이다
        System.out.println(apple.get());

        Box grapeBox = new Box();
        grapeBox.setItem(new Grape());

        if (grapeBox.getItem() instanceof Apple) { // 2) 타입 안정성이 떨어지는 문제
            Apple grape = (Apple) grapeBox.getItem();
            System.out.println(grape.get());
        }

        // 현재 Object로 범위가 좁혀져 있어서 명시적 형 변환이 필요 (다운 캐스팅)
        Grape grape = (Grape)grapeBox.getItem();
        System.out.println(grape.get());
    }
}
