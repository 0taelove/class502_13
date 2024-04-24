package exam01;

public class Outer {

    private Calculator cal2 = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    public Calculator method(int num3) { // void -> 같은 자료형인 Calculator로 변경
        // 함수이기 때문에 ()안에 num3이라는 멤버 변수 선언 가능(멤버 변수 중 지역변수)
        // 원래는 return 이후에 자원을 사용하고 반환값인 30이 대입되었을 때 연산이 끝났기 때문에
        // 스택(임시 메모리에서)에서 제거가 되어야 하는데 이후 연산에도 제거되지 않은 것을 확인 가능
        // 값을 계속 사용하기 있기 때문에 스택이 아닌 데이터 영역에 상수 형태로 할당되어 있게 됨
        /*Calculator cal 스택*/ return new Calculator() { // 객체 생성 - 힙 -> 주소값을 대입해줌
            //위의 Calculator 변수는 주소값을 반환해주는 역할만 함 -> 메모리 할당 없이 바로 return
            public int add(int num1, int num2) {
                // num3 = 100; 지역 변수의 상수화 final int num3 ...
                return num1 + num2 + num3; // 멤버변수의 값을 add에 더해서 사용하겠다고 정의
            }
        };

        // return cal; // cal의 주소값을 반환해줌 -> void -> 자료형 Calculator
    }
}
