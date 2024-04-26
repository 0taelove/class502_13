package exam03;
// String 클래스의 유용한 메서드
public class Ex02 {
    public static void main(String[] args) {
        String fileName = "image.png";
        String extension = fileName.substring(6);
        System.out.println(extension);
        String str = fileName.substring(2,5); // 2,3,4
        System.out.println(str);
    }
}