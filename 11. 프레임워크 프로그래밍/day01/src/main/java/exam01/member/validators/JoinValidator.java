package exam01.member.validators;

import exam01.global.validators.Validator;
import exam01.member.controllers.RequestJoin;
import exam01.member.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;

// 의존성 주입
public class JoinValidator implements Validator<RequestJoin> {

    @Autowired
    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void check(RequestJoin form) {

    }
}
