package exam01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
        // HashSet<String> names = new HashSet<>();

        // 기본 정렬 기준
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // return o1.compareTo(o2); // 오름 차순
                // return o2.compareTo(o1); // 내림 차순
                return o1.compareTo(o2) * -1; // 내림 차순
            }
        };

        // Set<String> names = new TreeSet<>(comp); // 다형성, 알게 모르게 바꿈
        Set<String> names = new TreeSet<>(Comparator.reverseOrder());
        // 오름 차순 또는 내림 차순 둘 중 하나이기 때문에 객체 생성 없이 정의되어 있는 기능 사용만 하면 됨
        names.add("이름2");
        names.add("이름2");
        names.add("이름1");
        names.add("이름3");
        names.add("이름5");
        names.add("이름4");
        System.out.println(names); // names.toString()
    }
}
