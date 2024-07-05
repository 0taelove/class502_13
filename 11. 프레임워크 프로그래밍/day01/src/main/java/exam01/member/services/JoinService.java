package exam01.member.services;

import exam01.member.controllers.RequestJoin;
import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import exam01.member.validators.JoinValidator;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class JoinService {

    // 스프링 컨테이너에 등록한 빈에게 의존관계주입이 필요할 때, DI(의존성 주입)을 도와주는 어노테이션이다
    // 의존 관계가 없을 때(아래 코드 주석처리) 활용할 수 있음
    @Autowired
    private JoinValidator validator;

    @Autowired
    private MemberDao memberDao;

    /*
    // 첫 번째 방식 의존성 주입 : 생성자를 통한 주입 방식
    // 의존 관계 - 없으면 객체 생성 X
    public JoinService(JoinValidator validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }
     */

    /*
    // 두 번째 방식 의존성 주입 :
    // 연관 관계 - 없어도 객체는 생성 된다.
    public void setValidator(JoinValidator validator) {
        this.validator = validator;
    }
     */

    // 의존성 주입(통제를 위해 필요)
    public void process(RequestJoin form) {
        validator.check(form); // joinSerivice는 validator 객체, form 객체를 의존 -> 의존성

        // 데이터 영구 저장 - DAO(Data Access Object)
        Member member = Member.builder()
                        .email(form.getEmail())
                        .password(form.getPassword())
                        .userName(form.getUserName())
                        .regDt(LocalDateTime.now())
                        .build();

        memberDao.register(member);
    }
}
