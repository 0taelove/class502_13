package exam01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
        //HashSet<Book> books = new HashSet<>();
        Set<Book> books = new TreeSet<>(Comparator.reverseOrder()); // 다형성, 알게 모르게 바꿈
        // 오름 차순 또는 내림 차순 둘 중 하나이기 때문에 객체 생성 없이 정의되어 있는 기능 사용만 하면 됨

        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));


        for (Book book : books) {
            System.out.println(book);
        }
    }
}