package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) { // interface가 객체가 되는 조건 활용
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4");
        names.forEach(s -> System.out.println(s)); // 함수형 프로그래밍 람다식 구조로

        /*
        names.forEach(new Consumer<String>() { // Consumer 매개변수로 함수가 쓰이는 것과 동일
            @Override
            public void accept(String s) { // 사용자 정의 기능, 역할 1가지 수행
                System.out.println(s);
            }
        });
        */
    }
}
