package exam01;

import java.util.function.Supplier;

public class Ex08 {
    public static void main(String[] args) {
        Supplier<Book> s1 = () -> new Book(); // Book 객체를 생성하고 Supplier interface로 정의
        Supplier<Book> s2 = Book::new;

        Book b1 = s2.get();
        System.out.println(b1);
    }
}
