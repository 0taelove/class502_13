package exam02;

public class Student {
    protected int id;
    protected  String name;

    // public Student() {} // 방법 중 1개로 기본 생성자를 추가해주면 Hight에서 오류가 안 난다.
    // 하지만 확실하게 매개변수만 있는 형태로 객체를 만들고 싶은 경우가 있기 때문에 기본 생성자를 만들지 않을 수 있다.

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
