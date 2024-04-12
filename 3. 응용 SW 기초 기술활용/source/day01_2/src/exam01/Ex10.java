package exam01;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 10000000;
        byte num2 = (byte)num1; // 명시적 형변환 (더 작은 곳에 담을게)
        System.out.println(num2); // 데이터가 유실 됨

        int num3 = 100;
        byte num4 = (byte)num3;
        System.out.println(num4); // 데이터가 유실되지 않음
    }
}
