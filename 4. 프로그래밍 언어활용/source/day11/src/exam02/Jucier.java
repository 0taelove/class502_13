package exam02;

import java.util.ArrayList;

public class Jucier {
    // ? - Fruit, Apple, Grape / extends는 하위 클래스 상한 제한
    public static void make(FruitBox<? extends Fruit> box) {
        ArrayList<?> fruits =  box.getItems();
        System.out.println(fruits);
    }

    // 지네릭 메서드, extends만 사용 가능
    public static <T extends Fruit> void make3(FruitBox<T> box) {

    }

    // ? = Apple, Fruit, Object / super는 상위 클래스 하한 제한
    public static void make2(FruitBox<? super Apple> box) {
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }
}