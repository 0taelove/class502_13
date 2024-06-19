package org.choongang.member.servies;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.choongang.member.mapper.MemberMapper;
import org.choongang.member.validators.JoinValidator;

// 객체 조립기 -> 객체 통제의 용이성, 개방폐쇄원칙 적용
// 한 곳에서 관리하기 때문에 필요시 아래에 더 추가하면 됨
public class MemberServiceProvider {
    private static MemberServiceProvider instance;

    private MemberServiceProvider() {}

    public static MemberServiceProvider getInstance() {
        // 기능, instance가 null일 때 1번만 객체 생성
        if (instance == null) {
            instance = new MemberServiceProvider();
        }

        return instance;
    }

    // 의존 객체 MemberMapper 주입
    public MemberMapper memberMapper() {
        SqlSession session = DBConn.getSession();
        return session.getMapper(MemberMapper.class);
    }

    public JoinValidator joinValidator() {
        return new JoinValidator(memberMapper());
    }

    public JoinService joinService() {
        return new JoinService(joinValidator(), memberMapper());
    }
}
