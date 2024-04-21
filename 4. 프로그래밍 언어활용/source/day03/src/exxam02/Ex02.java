package exxam02;

public class Ex02 {
    public static void main(String[] args) {
        Student.id = 10; // static으로 만든 변수는 객체를 만들지 않아도 접근이 가능
        System.out.println(Student.id);

        Student.staticMethod();
    }
}
