package exam01;

public class Ex05 {
    public static void main(String[] args) {
        String tran1 = "BUS";
        // Transportation BUS = Enum.valueOf(Transportation.class, tran1); // Enum 상수로 바꿔주는 역할(정보조회)
        // System.out.println(BUS.name());

        Transportation BUS = Transportation.valueOf(tran1); // 자료형이 Transportation으로 명확하기 때문에 class 안 써줘도 가능
    }
}