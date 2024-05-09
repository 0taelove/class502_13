package exam02;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex02 {
    public static void main(String[] args) throws ParseException {
        String price = "1,000,000원";

        DecimalFormat df = new DecimalFormat("#,###원");
        Number number = df.parse(price);
        // 엄격한 예외 발생하여 throws ParseException 전가 필요
        long num = number.longValue();
        System.out.println(num);
    }
}
