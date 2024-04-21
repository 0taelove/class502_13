package exxam02;

public class Student {
    public static int id;
    private String name = "이이름"; // 변수가 아닌 정의이다
    private String subject;

    public Student() {}

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public static void staticMethod() {
        // 객체와 상관 없이 사용 가능, this 지역 변수 X
        // -> 객체의 자원 접근 X
        System.out.println("정적 메서드!!");
        // this.name = "이이름"; // this가 없기 때문에 객체 자원 접근 X
        // this.instanceMethod(); 마찬가지 안 됨
        id = 1000;
        // 정적 자원만 접근 가능(static 변수, 메서드)
    }

    public void instanceMethod() {
        System.out.println("인스턴스 메서드!!");
        // this 지역변수 O -> 객체 자원 접근 O
        System.out.println(this.name);
        // instanceMethod는 객체가 존재해야지만 호출이 가능함
        staticMethod(); // static이 먼저 정의되어 있기 때문에 호출 가능
        id = 1000; // 위와 == 정적 자원은 객체 생성 이전부터 존재
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
