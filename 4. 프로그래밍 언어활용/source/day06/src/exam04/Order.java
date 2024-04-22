package exam04;

public class Order implements Seller, Buyer {
    @Override
    public void buy() {
        System.out.println("구매!");
    }

    @Override
    public void sell() {
        System.out.println("판매!");
    }

    public void order() {
        Buyer.super.order();
        // Buyer 쪽의 order를 사용하겠다고 명시해주면 오류가 해결 됨
    }
}
