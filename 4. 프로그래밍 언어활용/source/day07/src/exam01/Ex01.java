package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Calculator cal = outer.method(30); // num3의 값을 넣어줌
        // 함수 호출하여 결과값을 반환해줌 but 결과값이 주소 값
        int result = cal.add(10, 20);

        System.out.println(result);
    }
}
