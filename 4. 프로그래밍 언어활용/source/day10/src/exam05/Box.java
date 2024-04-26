package exam05;

public class Box<T> { // Type(자료형) 매개변수 <T> 사용
    private T item;

    public void setItem(T item) { // Type자료형 매개변수
        this.item = item;
    }

    public T getItem() { // 반환값 Type T
        return item; // 반환 값이 Object가 아닌 T
    }
}
