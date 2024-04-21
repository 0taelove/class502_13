package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year) {
        year = _year;
    }

    public int getYear() {
        return year;
    } // 값만 설정하는 게 아니라 조회할 수 있는 메서드를 정의

    public void setMonth(int _month) {
        month = _month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int _day) {
        if (month == 2 && _day > 28) {
            _day = 28;
        }

        day = _day;
    }

    public int getDay() {
        return day;
    }

    void showDate() {
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    } // %정수라는 의미
}