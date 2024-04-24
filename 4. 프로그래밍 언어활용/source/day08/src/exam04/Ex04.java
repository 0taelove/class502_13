package exam04;

import java.util.Objects;

public class Ex04 {
    public static void main(String[] args) {
        String str = null;

        str = Objects.requireNonNullElse(str, "");
        // NPE 방지 메서드 및 기본 값을 넣어줌

        str.toUpperCase(); // NullPointerException 발생, NPE
        // 변수를 선언 했는데 변수에 값이 없으면 NPE가 발생! -> 기본 값을 넣어주자
    }
}
