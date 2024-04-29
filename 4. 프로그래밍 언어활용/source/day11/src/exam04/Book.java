package exam04;

public class Book {
    private int isbn; // 도서 번호
    private String title; // 도서명
    private String author; // 저자

    public Book(int isbn, String title, String author) { // 데이터 타입
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() { // 내부 데이터 조회
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
