package exam03;

public class Resources implements AutoCloseable {
    // AutoCloseable 있어야만 close 메서드가 작동한다
    @Override
    public void close() throws Exception {
        System.out.println("자원해제!!");
    }
}
