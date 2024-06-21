package org.choongang.member.services;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.choongang.global.validators.Validator;
import org.choongang.member.entities.Member;
import org.choongang.member.mapper.MemberMapper;

// 개방폐쇄원칙
public class LoginService {

    private Validator<HttpServletRequest> validator;
    private MemberMapper mapper;

    public LoginService(Validator<HttpServletRequest> validator, MemberMapper mapper) {
        this.validator = validator;
        this.mapper = mapper;
    }

    public void process(HttpServletRequest request) {
        // 로그인 유효성 검사
        validator.check(request);

        // 로그인 처리  - 회원 정보 조회, 세션에 유지
        String email = request.getParameter("email");
        Member member = mapper.get(email);

        // 나만 내 로그인 정보를 활용 가능 -> 세션에 member 값 저장되어 있으면 로그인 상태
        // index.jsp의 sessionScope.member의 기능
        HttpSession session = request.getSession();
        session.setAttribute("member", member);
    }
}