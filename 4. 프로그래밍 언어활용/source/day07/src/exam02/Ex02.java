package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
    public static void main(String[] args) {
        // throw new FileInputStream(...) 내부에 존재
        // 예외 처리할 객체를 잡아서 던진다
        try { // 예외가 발생할 가능성이 있는 코드
            FileInputStream fis = new FileInputStream("b.txt");

            System.out.println("파일 처리..."); // 예외 발생시 하단 코드 실행 X -> catch로 던져짐

        } catch (FileNotFoundException e) { // 예외 객체 e = new FileNotFound...
            System.out.println("예외 발생!");
            // 있는 파일을 정의하면 파일 처리, 없는 파일을 정의하면 예외 발생
            // String message = e.getMessage();
            // System.out.println(message);
            e.printStackTrace(); // 오류 발생한 지점의 정보 체크해주는 메서드
        }

        System.out.println("매우 중요한 실행 코드...");
        // 예외 발생시 아래 코드가 실행 된다
    }
}
