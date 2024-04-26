package exam03;
// String 클래스의 유용한 메서드
public class Ex04 {
    public static void main(String[] args) {
        String fruits = "Apple,Orange,Mango,Apple";
        System.out.printf("indexOf : %d%n",fruits.indexOf("Apple")); // 왼쪽에서 오른쪽
        System.out.printf("lastIndexOf : %d%n",fruits.lastIndexOf("Apple")); // 오른쪽에서 왼쪽
        System.out.printf("indexOf Banana : %d%n",fruits.indexOf("Banana")); // 없는경우 -1
    }
}
