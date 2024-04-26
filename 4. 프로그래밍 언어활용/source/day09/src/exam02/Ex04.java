package exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문장을 입력하세요:");
        String str = sc.nextLine();

        // Pattern p1 = Pattern.compile("[a-z, A-Z]"); // 범위 메타 문자 -
        // a-z까지 중 문자 1개만 있어도 통과
        // 알파벳 대소문자 구분 없이 체크
        Pattern p1 = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher(str);

        if (!m1.find()) {
            System.out.println("알파벳이 포함되지 않았습니다.");
        }
    }
}
