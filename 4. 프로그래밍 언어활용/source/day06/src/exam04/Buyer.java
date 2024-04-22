package exam04;

public interface Buyer {
    void buy();

    default void order() {
        System.out.println("Buyer에서 주문"); //구현체 넣어주면 됨
        // interface는 추상메서드를 통한 구현이 목적이었는데 정의를 해버리면 오류가 남
        // -> 이 때 default를 넣어준다. (public 범위가 되고 완전히 구현된 인스턴스 메서드가 됨)
    }   // 즉, default가 없으면 추상 메서드로 판단하지만 default가 붙으면 인스턴스 메서드로 판단한다
}
