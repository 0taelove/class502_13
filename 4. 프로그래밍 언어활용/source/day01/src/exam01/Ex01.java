package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 클래스명 변수명 = 함수 // 객체 생성
        s1.id = 1000;
    }
}
//Student라는 설계도면을 가지고 거기에 있는 변수 정의
//id name subject가필요하다고 판단하고 객체가 되시면 그 공간이 만들어진다 -> 변수는 공간을 할당받아야 변수가 된다
//접근하는 법. 객체안의 자원들은 마침표를 통해 접근 가능
//s1.id = 1000; 대입 -> 값이 저장 // 저장하려면 메모리가 필요 -> 메모리가 필요 -> 변수가 됨
