package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book(1000, "책1", "저자1");
        // 메서드 재정의
        System.out.println(book); // 참조 변수 출력시 book.toString() 자동 추가
        Class cls = Book.class; // 모든 클래스에 정적 변수로 추가 된다
        Class cls2 = book.getClass(); // 클래스 구성 정보를 가져올 수 있다
    }
}
