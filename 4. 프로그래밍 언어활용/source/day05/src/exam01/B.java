package exam01;

public class B extends A { // B가 A를 상속
    int numB = 20; // 정의만 해준 상태로 객체가 되면 10이 대입되며 변수가 된다

    public B() { // default로 기본생성자가 생성되기 때문에 생략 가능
        // 모든 생서자의 첫 번째 라인에 자동적으로 추가되는 함수로 this와 동일, 있어야 객체 생성 가능
        super(); // A 클래스에 정의된 A()
        System.out.println("B 생성자!");
    }
}
