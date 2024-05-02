package exam01;

import java.util.function.Supplier;

// 메서드 참조
// 그냥 변수를 출력하면 되지만 굳이 설명을 위해 구현해본 기능
public class Book {
    private String title;

    public String getTitle() {
        return title;
    }

    public void printTitle() {
        Supplier<String> t1 = () -> getTitle();
        Supplier<String> t2 = this::getTitle;
    }
}
