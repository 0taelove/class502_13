package exam06;

import java.lang.*; // 자동 추가

public class Book extends java.lang.Object { // 상위 클래스 자동 상속
    private int isbn; // 도서 번호
    private String title; // 책 제목
    private String author; // 저자
    // 멤버 변수 3개 정의

    // 생서자로 초기화
    public Book(int isbn,String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("isbn=%d, title=%s, author=%s%n", isbn, title, author); // super.toString... super : 상위 클래스의 주소값

    }
}