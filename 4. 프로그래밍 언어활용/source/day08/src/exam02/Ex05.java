package exam02;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        // 메서드 체이닝 기법
        String str = sb.append("ABC")
                        .append("DEF")
                        .append("GHI")
                        .toString();
        System.out.println(str);
        /*
        StringBuffer sb2 = sb.append("ABC");
        System.out.println(sb == sb2);
        StringBuffer sb3 = sb2.append("DEF");
         */
        // this를 반환했기 때문에 동일한 객체를 가리킨다
    }
}