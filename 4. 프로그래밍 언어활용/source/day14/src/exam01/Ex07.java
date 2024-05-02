package exam01;

import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public class Ex07 {
    public static void main(String[] args) {
        ToIntFunction<String> func1 = s -> s.length();
        ToIntFunction<String> func2 = String::length; // 위와 동일 기능

        // 처리 순서가 같아야만 구현 가능, s2.equals(s1)이면 String::equals 불가능
        BiPredicate<String, String> cond1 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> cond2 = String::equals; // 위와 동일 기능
    }
}
