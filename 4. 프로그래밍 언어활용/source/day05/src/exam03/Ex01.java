package exam03;

import exam01.C;

public class Ex01 {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        int result = cal.add(10, 20);
        System.out.println(result);

        System.out.println(cal.num);
        // 이 단계에서 Calculator는 추상클래스이기 때문에 객체, 변수가 될 수 없는데
        // 값이 정상적으로 담겨있는 모습을 확인 가능... -> 객체가 됐다는 걸 의미
        // SimpleCalculator는 Calculator를 포함하고 있고 Simple은 객체가 있기 때문에 상위 클래스 또한 상속의 과정에서 객체가 됨
    }
}
