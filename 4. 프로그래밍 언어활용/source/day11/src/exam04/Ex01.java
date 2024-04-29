package exam04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        /*
        for (int i = 0; i < names.size(); i++) {
            names.remove(i); // 배열의 특징 때문에 이름2, 4가 남는 현상
        }
        */

        for (int i = names.size() - 1; i >= 0; i--) {
            names.remove(i);
        }

        for (int i = 0; i< names.size(); i++) { // length 대신 size 요소의 갯수
            String name = names.get(i);
            System.out.println(name);
            // System.out.println(names); // naems.toString(); -> 담긴 값을 확인할 수 있도록 재정의
        }
    }
}
