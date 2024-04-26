package exam03;

@Todo("할일1")
@Todo("할일2") // Repeatable로 반복적으로 적용 가능
@Todo("할일3")
public class Ex04 {
    public static void main(String[] args) {
        Class cls = Ex04.class;
        Todos todos = (Todos)cls.getAnnotation(Todos.class);
        Todo[] todo = todos.value();
        for (Todo t : todo) {
            System.out.println(t.value());
        }
    }
}
