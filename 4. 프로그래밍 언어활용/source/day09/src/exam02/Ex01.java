package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
    public static void main(String[] args) {
        String str = "I like java and javascript";

        Pattern p1 = Pattern.compile("java"); // 패턴 객체 생성
        Matcher m1 = p1.matcher(str); // 다형성 적용 str도 가능 문자열 존재 여부 체크
        // 1칸 씩 이동하며 체크
        System.out.println(m1.find()); // 일치 여부 체크 java true
        System.out.println(m1.group()); // 매칭되는 문자열 java
        System.out.println(m1.find()); // java true
        System.out.println(m1.group()); // java
        System.out.println(m1.find()); // false
        System.out.println(m1.group()); // false
    }
}
