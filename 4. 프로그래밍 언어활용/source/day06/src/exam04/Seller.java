package exam04;

public interface Seller {
    void sell();
    default void order() {
        System.out.println("Seller에서 주문");
        // 어느 것을 호출해야 할지 명확하지 않고 애매해서 오류 발생
    }

    public static void staticMethdd() {
        System.out.println("정적 메서드, 인터페이스 이든, 클래스이든 원래부터 사용 가능");
    }
}
