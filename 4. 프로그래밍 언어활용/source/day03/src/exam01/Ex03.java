package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(2024, 3, 20);
        System.out.println(s1); // 주소값을 16진수 이게 더 간략함
        // s1.toString(); -> 멤버 변수의 값을 확인하는 용도로 재정의
        // 메서드가 자동으로 호출된 것(모든 클래스 상속관계에 정의되어있음)
        // System.out.println(System.identityHashCode(s1)); // 주소값을 10진수로
    }
}
