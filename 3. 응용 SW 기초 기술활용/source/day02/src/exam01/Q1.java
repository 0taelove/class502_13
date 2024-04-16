package exam01;

public class Q1 {
    public static void main(String[] args) {
        int i = 20;
        double j = 3.0;

        // int k = i * (int)j; //정수로 형변환, 데이터가 유실
        int k = (int)(i * j); // int i -> double을 정수로 형변환
        System.out.println(k);
    }
}
