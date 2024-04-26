package exam03;
// String 클래스의 유용한 메서드
public class Ex03 {
    public static void main(String[] args) {
        String str = "        ";
        System.out.printf("str.isEmpty() : %s%n",str.isEmpty()); // 여백을 미포함 체크
        System.out.printf("str.isBlank() : %s%n",str.isBlank()); // 여백을 포함 체크
    }
}
