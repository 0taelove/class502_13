package exam02;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Month month = today.getMonth();
        System.out.println(month);

        Locale locale = new Locale("ko", "kr");
        String yoilStr = month.getDisplayName(TextStyle.FULL, locale);
        System.out.println(yoilStr);

        String yoilStrEng = month.getDisplayName(TextStyle.FULL, locale.JAPANESE);
        System.out.println(yoilStrEng);
    }
}
