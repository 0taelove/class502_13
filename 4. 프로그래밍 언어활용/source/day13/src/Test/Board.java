package Test;

public class Board {
    private static Board instance;

    static {
        System.out.println("객체 생성 X 바로 실행");
    }

    private Board() {}

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }
}