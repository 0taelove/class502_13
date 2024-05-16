package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex09 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("book.txt");
        ObjectInputStream ois = new ObjectInputStream(fis)) {

            /**
             * Book book = new Book(..., ..., ...);
             * 복구시에 필요한 데이터 저장 -> 다시 객체 생성, 값 대입
             */

            // 동일한 순서대로 읽어와야 가능,, 순서 변경시 에러 발생
            Book book1 = (Book)ois.readObject();
            System.out.println(book1);

            Book book2 = (Book)ois.readObject();
            System.out.println(book2);

            String str = (String)ois.readObject();
            System.out.println(str);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
