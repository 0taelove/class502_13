package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int r = add(10, 20);
        System.out.println(r);
    }

    static int add(int n1, int n2) { // 함수 지역
        int result = n1 + n2; // 지역 변수 == 함수가 수행될 때만 활성화
        // int n1, n2, result는 모두 호출되어야 변수가 됨, 지역변수
        return result;
    }

}
