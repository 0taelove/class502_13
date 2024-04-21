package exam03;

public abstract class Calculator {
    int num = 10;
    // 상속의 과정에서 객체가 되었지만 기능적으로 불안정한 클래스이기 때문에 직접 생성을 못하게 제한되어 있다

    public abstract int add(int num1, int num2);
    // 함수가 호출할 내용이 중괋호 안에 정의하는데 함수의 정의가 있는 추상 메서드
    // 뭘 수행할지 모르고 함수의 접근 제어자와 반환값과 매개변수만 정의되어 있음
}
