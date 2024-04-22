package Test;

public class B {
    public static void main(String[] args) {

        for (int i = 1; i <= 40; i++) {
            int roomNo = i % 10; // 0~9가 나옴
            System.out.printf("학생%d, 방번호 %d번\n", i, roomNo);
        }
    }
}
