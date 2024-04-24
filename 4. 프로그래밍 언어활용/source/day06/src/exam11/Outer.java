package exam11;

public class Outer {
    public Calculator method(int num3) { // void가 아닌 Calculator로 교체 아래와 같은 자료형으로 바꾸기 위해
        // num3은 함수 안에 정의 된 지역변수로 호출 됐을 때 스택(임시 메모리)에서 자원을 할당 받고
        // 연산이 끝나면 객체의 주소값을 내보내면 지역변수는 제거가 되야 한다
        // 하지만 Ex01에서 확인 시 연산에서 계속 사용되고 있음
        // num3은 스택(임시 메모리)에 할당되어 있는 게 아니다 즉, 스택이 아니다
        // 남은 데이터, 힙 중에 1개일 것이다. 즉, 지역내부에 쓰고있다면 변수를 데이터 영역에 변수가 만들어진다.
        // 코드와 상수가 데이터 영역 메모리에 들어가고 num3은 상수화가 된다.
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                // num3 = 100; // 변수인데 안 바뀌는 이유는 num3가 상수이기 때문이다
                // final int num3 = 지역변수의 상수화
                return num1 + num2 + num3; // 완전하게 객체를 만들면 활용이 가능
            }
        };

        return cal; // 반환값이(주소값이) 외부로 빠져나감
    }
}
