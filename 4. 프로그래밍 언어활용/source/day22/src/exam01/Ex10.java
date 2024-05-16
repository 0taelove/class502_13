package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // 유연하게 사용하기 위한 Map 활용, 순서 유지 안 해도 되고 하나에 담아서 저장하고 복구 시 데이터 가져오면 됨
            HashMap<String, Object> data = new HashMap<>(); // Map에만 저장되고 복구시 Map을 가져오면 됨

            Book book1 = new Book(1000, "책1", "저자1");
            Book book2 = new Book(1001, "책2", "저자2");

            List<Book> books = Arrays.asList(
                    new Book(1002, "책3", "저자3"),
                    new Book(1003, "책4", "저자4")
            );

            data.put("book1", book1);
            data.put("book2", book2);
            data.put("books", books);
            data.put("str", "안녕하세요.");

            oos.writeObject(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}