package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3");
        List<String> fruits = Arrays.asList("Apple", "Orange", "Melon");

        // 중첩 Stream 구조의 평탄화 작업을 할 때 Map이 아닌 flatMap으로 해줘야 함
        Stream<Stream<String>> stm = Stream.of(names.stream(), fruits.stream());

        /*
        stm.forEach(st -> {
            st.forEach(System.out::println);
        });
        */
        //stm.flatMap(s -> s).forEach(System.out::println);
        String[] strs = stm.flatMap(s -> s).toArray(String[]::new);
        System.out.println(Arrays.toString(strs)); // [이름1, 이름2, 이름3, Apple, Orange, Melon]
    }
}
