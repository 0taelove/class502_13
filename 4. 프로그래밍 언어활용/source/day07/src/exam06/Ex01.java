package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book); // 참조 변수 출력시 book.toString() 자동 추가
        Class cls = Book.class;
        Class cls2 = book.getClass(); // 클래스 구성 정보를 확인
    }
}
