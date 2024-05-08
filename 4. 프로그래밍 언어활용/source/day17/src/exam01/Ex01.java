package exam01;

import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);

        cal.set(Calendar.MONTH, 11); // 12월, 원객체의 값을 변경

        printDate(cal);
    }

    public static void printDate(Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); // 0 ~ 11, 11월 - 0
        int day = cal.get(Calendar.DAY_OF_MONTH);

        // 0~11로 되어있기 때문에 +1을 하여 1~12로 조정해줘야 함
        System.out.printf("year=%d, month=%d, day=%d%n", year, month + 1, day);
    }
}
