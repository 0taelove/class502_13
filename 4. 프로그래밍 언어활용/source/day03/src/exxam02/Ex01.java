package exxam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름", "자바");
        Student s2 = new Student(1001, "김이름", "리액트");

        System.out.println("s1:" +s1); // s1.id = 1000;
        System.out.println("s2:" +s2); // s2.id = 1001;

        System.out.println(s1.id); // Student.id
        System.out.println(s2.id); // Student.id
        // 멤버변수와 혼동할 수 있기 때문에 클래스.변수명으로 사용해줘야 함

        s1.instanceMethod();
    }
}
