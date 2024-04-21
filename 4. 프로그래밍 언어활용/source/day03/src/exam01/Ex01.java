package exam01;

import exam01.Schedule;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        // s1.printThis();
        // System.out.println(s1);
        Schedule _this = s1.returnThis();
        System.out.println(_this == s1);
        // this의 주소 값과 s1 가지고 있는 주소값이 같다.

        // s1.year = 2024;
        // s1.month = 2;
        // s1.day = 31; // 지양, 통제가 불가능 해지므로

        // set 정보은닉되어 있던 메서드에 값 대입 가능
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        // get 정보은닉 되어있던 메서드를 조회
        int month = s1.getMonth();
        System.out.println(month);

        s1.showDate();
    }
}