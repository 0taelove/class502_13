package exam02;

import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num1 = 1000000000.123;

        // 적은 만큼 0으로 채워넣고
        DecimalFormat df = new DecimalFormat("0,000.000000");
        String num1Str = df.format(num1);
        System.out.println(num1Str);

        // 남은 자리수는 무시함
        DecimalFormat df2 = new DecimalFormat("#,###.######");
        String num1Str2 = df2.format(num1);
        System.out.println(num1Str2);
    }
}