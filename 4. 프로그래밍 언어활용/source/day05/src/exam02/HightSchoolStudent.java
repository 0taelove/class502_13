package exam02;

public class HightSchoolStudent extends Student {

    public HightSchoolStudent() { // 정의하지 않으면 이런 기본 생성자가 추가된다
        // Student는 생성자가 정의되어 있기 때문에 기본 생성자가 생기지 않음
        super(1000, "이이름"); // 모든 생성자의 첫 번째 라인에 자동 추가되는 super();
        // 오류 해결 위해선 방법 중 1개로 여기에 매개변수를 정의하거나 super로 한다면 상위클래스에 매개변수가 있는 super로 변경하거나
    }

    @Override
    public String toString() {
        return "HightSchoolStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
