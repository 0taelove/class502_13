package exam06;

import java.time.LocalDate;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today); // today.toString();
        // toString class는 클래스의 목적에 맞게 재정의 된다
        // 기본이 출력이 안 되면 재정의가 되어있다고 생각하면 된다
    }
}
