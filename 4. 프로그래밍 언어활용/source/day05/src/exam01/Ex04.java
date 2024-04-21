package exam01;

public class Ex04 {
    public static void main(String[] args) {
        A ad = new D();

        A ac = new C();

        if ( ad instanceof C) {
        C c = (C)ad; // C = A,B 포함, D = A 포함, C = D 대입 X
        // 데이터 유실의 가능성이 있기 때문에 대입 안 됨 -> 강제 형변환
        }

        if (ac instanceof C) {
            C cc = (C)ac;
            // ac는 calss C로부터 상속받은 객체이기 때문에 주소값이 같음
            System.out.println(cc.numC);
        }
    }
}
