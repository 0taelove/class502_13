package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int c = 10;
        Calculator cal = (a, b) -> { // 코드 1줄 이상시 {} 정의 필요 return 필요
            return a + b + c;
        };

        int result = cal.add(10, 20);
        System.out.println(result);

        /* 컴파일러가 파악할 수 있는 부분은 생략 가능 -> 람다식 // -> 시그니쳐 기호 형식은 지켜야 한다
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2
            }
            자료형 Calculator 생략 가능
            반환값 타입 int 생략 가능
            한 줄 입력시 {} 생략 가능
            void가 있으면 반환값이 없음인데 interface Calculator의 void가 아니니 return도 있다는 가정하에 생략 가능
            변수명도 한 글자로 생략 가능
         */

    }
}
