package homework;

import java.time.LocalDate;

public class Calenderhelp {
    public static void main(String[] args) {
        // 매월의 1일이 어떤 요일에 시작하는지
        LocalDate today = LocalDate.now();
        LocalDate startDate = LocalDate.of(today.getYear(), today.getMonth(), 1);

        int yoil = startDate.getDayOfWeek().getValue(); // 1(월)~7(일)
        // 요일을 0(일)~6(토) -> yoil % 7
        System.out.println(yoil);

        // 매월의 종료일이 무엇이지(30, 31, 28, 29)
        LocalDate endDate = startDate.plusMonths(1).minusDays(1);
        System.out.println(endDate);
    }
}
