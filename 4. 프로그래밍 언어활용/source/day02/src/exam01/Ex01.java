package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // new 메모리 생성되는 역할, new Student라는 객체 생성
        s1.id = 1000; // 인스턴스 변수 == 멤버 변수 / 객체가 되어야 사용할 수 있는 변수
        s1.name = "이이름";
        s1.subject = "자바";
        System.out.println(s1.id);
        s1.study(); // 인스턴스 메서드 == 멤버 메서드 / 객체가 되어야 사용할 수 있는 메서드

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.subject = "자바스크립트";

        s2.study();

        System.out.println(s1 == s2);

        Student s3 = s2;
        s3.name="(수정)김이름";
        s3.study();

        s2.study();

        System.out.println(s3 == s2);

        s1 = null;
        s1.study();
    }
}
