package exam04;

public class LoginService {
    public void login(String userId, String userPw) {
        // userId = user01, userPw = 123456
        try { // RunTimeException이 없기 때문에 try로 감싸줘야 한다
        if (!userId.equals("user01")) { // user01이 아이디가 아닐 때
            throw new UserIdException("아이디가 일치하지 않습니다"); // 던져 줌
        }

        if (!userPw.equals("123456")) { // 123456이 비밀번호가 아닐 때
            throw new UserPwException("비밀번호가 일치하지 않습니다"); // 던져 줌
        }
            System.out.println("로그인 성공!");
    } catch (UserIdException | UserPwException e) {
            System.out.println(e.getMessage());
            // thorw가 catch로 유입 된다
        }
    }
}
