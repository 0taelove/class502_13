package exam03;

// @MyAnno(min=10, max=100) 기본값 설정으로 쓰지 않아도 됨
// @MyAnno(names={"이름1", "이름2"}) 기본값 설정으로 쓰지 않아도 됨
// @MyAnno(value="이름1")
// @MyAnno("이름") // value="이름"과 동일
@MyAnno(value="이름", min=20)
public class Ex02 {
}

