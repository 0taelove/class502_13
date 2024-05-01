package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// 필요할 때만 정의해서 사용하고 버리는 형태이기 때문에 짧게 쓰자!
public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5");
        // forEach가 배열에 정의되어 있음 -> 인터페이스가 매개변수 -> 인터페이스의 구현 객체가 들어가면 됨
        names.forEach(s -> System.out.println(s)); // 람다식으로 짧게 아래 코드와 동일 기능 구현

        /* names.forEach(new Consumer<String>() {

            // 추상 메서드, 2개 있으면 안 됨
            @Override
            public void accept(String s) { // 매개변수로 사용 X
                // 자바에서 객체가 되면 매개변수가 되기 때문에
                // 인터페이스가 객체가 되는 조건을 활용하여 비슷하게 흉내를 낸다
                // accept를 내부에서 호출
                System.out.println(s); // 사용자 정의 기능
            }
        });
        */
    }
}
