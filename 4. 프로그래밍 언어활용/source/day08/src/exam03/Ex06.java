package exam03;

public class Ex06 {
    public static void main(String[] args) {
        Integer num1 = 100; // Integer.valueOf(100) 자동 추가 - 오토 박싱
        Integer num2 = 200;
        // 2개 다 객체이지만 연산이 가능해짐
        // 내부적으로 Interger num1이라는 객체 안에 Wrapper가 100을 감싸줌

        //함수 호출 감싸고 꺼내고 -> 연산 1개 하는데 3번의 작업 -> 기본형으로 연산하는 게 편함
        double num3 = num1.doubleValue();
    }
}
