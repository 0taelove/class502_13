package exam03;

// 멤버 변수 2개
public class Person {
    public int age;
    public String name;

    public Person() {}
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 생성자 2개
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
