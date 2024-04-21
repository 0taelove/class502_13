package exam01;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public Schedule() {
    this(2024, 4, 17);
    } // 클래스 내부에서 아래 생성자 메서드를 호출한다 객체생성X
    // this 메서드는 생성자 메서드의 첫줄에만 정의가 된다
    // 함수로 사용되는 this


    public Schedule(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year; // this로 객체의 자원임(멤버변수)을 명시해주면 구분히 편함
    } // 지역변수로 사용되는 this

    public int getYear() {
        return year;
    } // 값만 설정하는 게 아니라 조회할 수 있는 메서드를 정의

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        if (this.month == 2 && day > 28) {
            day = 28;
        } // 함수 사용시 통제 가능한 로직을 추가 O
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void showDate() {
        System.out.printf("year=%d, month=%d, day=%d\n", year, month, day);
        // %정수라는 의미 this.year...  this 생략 가능
        printThis(); // == this.printThis()
    }

    public void printThis() {
        System.out.println(this);
    }

    public Schedule returnThis() {
        return this;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}