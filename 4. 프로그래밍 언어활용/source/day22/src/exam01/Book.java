package exam01;

import java.io.Serializable;

public class Book implements Serializable {
    private int isb; // 도서 번호
    private String title; // 도서명
    private String aythor; // 저자

    public Book(int isb, String title, String aythor) {
        this.isb = isb;
        this.title = title;
        this.aythor = aythor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isb=" + isb +
                ", title='" + title + '\'' +
                ", aythor='" + aythor + '\'' +
                '}';
    }
}
