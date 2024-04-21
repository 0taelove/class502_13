package exam03;

public class Board {

    private static Board instance = new Board();
    // 내부에서 만들고 내부에서 정적인 메서드로 생성된 객체를 가져온다
    private Board() {
    }

    public static Board getInstance() {
        return instance;
    }
}
