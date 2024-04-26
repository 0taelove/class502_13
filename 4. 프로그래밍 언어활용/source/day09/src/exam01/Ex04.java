package exam01;

import java.util.StringTokenizer;

public class Ex04 {
    public static void main(String[] args) {
        String fruits = "Apple#Orange,Melon_Banana+Mango";
        StringTokenizer st = new StringTokenizer(fruits, "#,_+");
        // 2번째 매개변수로 토큰을 사용

        while(st.hasMoreTokens()) { // 분해해서 출력
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
