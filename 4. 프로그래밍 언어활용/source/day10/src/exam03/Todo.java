package exam03;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Todos.class) // Todos에 있는 배열 형태로 정보를 확인
public @interface Todo {
    String value();
}
