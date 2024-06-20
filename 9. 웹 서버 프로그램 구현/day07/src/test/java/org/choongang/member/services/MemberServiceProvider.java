package org.choongang.member.services;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.choongang.member.mapper.MemberMapper;
import org.choongang.member.validators.JoinValidator;
import org.choongang.member.validators.LoginValidator;

// 객체 조립기 -> 객체 통제의 용이성, 개방폐쇄원칙 적용
// 한 곳에서 관리하기 때문에 필요시 아래에 더 추가하면 됨
public class MemberServiceProvider {
    private static MemberServiceProvider instance;

    private MemberServiceProvider() {}

    // 기능, instance가 null일 때 1번만 객체 생성
    public static MemberServiceProvider getInstance() {
        if (instance == null) {
            instance = new MemberServiceProvider();
        }

        return instance;
    }

    //rollback 기능
    public SqlSession getSession() {
        return DBConn.getSession();
    }

    // 의존 객체 MemberMapper 주입
    public MemberMapper memberMapper() {
        return getSession().getMapper(MemberMapper.class);
    }

    public JoinValidator joinValidator() {
        return new JoinValidator(memberMapper());
    }

    public org.choongang.member.services.JoinService joinService() {
        return new org.choongang.member.services.JoinService(joinValidator(), memberMapper());
    }

    public LoginValidator loginValidator() {
        return new LoginValidator();
    }

    // 객체 조립기를 통해 테스트 전에 객체를 불러올 수 있도록 설정
    public LoginService loginService() {
        return new LoginService(loginValidator(), memberMapper());
    }
}