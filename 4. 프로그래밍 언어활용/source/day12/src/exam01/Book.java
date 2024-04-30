package exam01;

//java.lang.Comparable 기본 정렬 기준 추가
import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private int isbn; // 도서 번호
    private String title; // 도서명
    private String author; // 저자

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book)obj;
            if (isbn == book.isbn && title.equals(book.title)
                    && author.equals(book.author)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override // implement method 추가로 에러 해결
    public int compareTo(Book o) {
        // return isbn - o.isbn; // 오름 차순
        return o.isbn - isbn; // 내림 차순
    }
}