package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {
        String str = "I like java and javascript"; // java만 적혀있다면 true 나옴

        Pattern p1 = Pattern.compile("java");
        // .*java.* 작성시 첫 변수에 정확한 패턴이 일치하지 않아도 포함여부 체크 후 true가 나옴
        Matcher m1 = p1.matcher(str); // 다형성 적용 str도 가능 문자열 존재 여부 체크
        // 1칸 씩 이동하며 체크
        boolean match = m1.matches();
        System.out.println(match);
    }
}
