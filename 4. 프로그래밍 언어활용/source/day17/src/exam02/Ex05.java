package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex05 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastYear = today.with(ChronoField.YEAR, 2023);
        // 불변성 유지가 되는 특성
        System.out.println("변경 X : " + today); // 2024-05-08
        System.out.println("변경 O : " + lastYear); // 2023-05-08
    }
}
