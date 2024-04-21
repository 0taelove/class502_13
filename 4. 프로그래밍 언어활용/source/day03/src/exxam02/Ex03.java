package exxam02;

public class Ex03 {
    public static void main(String[] args) {
        int result1 = add(10, 20);
        // main 함수또한 static이 붙어있기 때문에 정적인 자원만 접근 가능
        System.out.println(result1);

        int result2 = add(30, 40);
        System.out.println(result2);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
        // int add에 static이 없다면 main 함수는 여기로 접근 불가
    }
}
