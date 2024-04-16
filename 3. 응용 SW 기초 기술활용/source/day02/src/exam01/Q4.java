package exam01;

public class Q4 {
    public static void main(String[] args) {
        // 구구단을 홀수 단만 출력하도록 프로그램을 만드시오.
        for (int i = 2; i <= 9; i++) {

            if (i % 2 == 0) {
                continue; // 현재 반복을 중단, 새로 시작
            }

            System.out.println(i + "단 ===========");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);

            } // if문과 for문이 중첩되어 있으면 코드의 가독성이 떨어짐 continue 사용
        }
    }
}
