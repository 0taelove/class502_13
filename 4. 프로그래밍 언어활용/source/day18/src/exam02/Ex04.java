package exam02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04 {
    public static void main(String[] args) throws ParseException {
        String strDate = "31/05/23 00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
        // 엄격한 예외 발생하여 throws ParseException 전가 필요
        Date date = sdf.parse(strDate);
        System.out.println(date);
    }
}
