package homework;

import java.util.Scanner;

public class CalenderTest {
    public static void main(String[] args) {

        // 달력 입력
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("년 월 입력:");
            String input = sc.nextLine(); // 2024 5

            if (input.equals("exit")) {
                System.out.println("종료 합니다.");
                break;
            }

            // 달력 출력
            try {
                String[] data = input.split("\\s+");
                int year = Integer.parseInt(data[0]);
                int month = Integer.parseInt(data[1]);

                System.out.printf("---- %d년 %d월 ----%n", year, month);
                System.out.println("일  월  화  수  목  금  토");

            } catch (Exception e) { // 숫자 형식 오류가 발생한 경우
                System.out.println("입력 형식이 잘모 되었습니다. 입력 예) 2024 5");
                continue;
            }
        }
    }

    public static Object getCalendar(int year, int month) { /**
     * 1. 매월의 1일이 어떤 요일에 시작하는지
     * 2. 매월의 종료일이 무엇이지(30, 31, 28, 29)
     */

        return null;
    }
}
