package exam01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {
        // RuntimeException 이 없을 때는 예외 처리가 없어 오류가 나기 때문에 전가처리 해줘야 함
        Scanner sc = new Scanner(new File("data.txt"));

        int total = 0;
        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num);
            total += num;
        }

        System.out.println(total);
    }
}
