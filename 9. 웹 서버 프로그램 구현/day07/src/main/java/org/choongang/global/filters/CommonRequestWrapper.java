package org.choongang.global.filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.choongang.member.MemberUtil;
import org.choongang.member.entities.Member;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(ServletRequest req) {
        super((HttpServletRequest) req); // 형변환

        // 상위 클래스 ServletRequestWrapper
        // 하위 클래스 HttpServletRequest
        // 상위 -> 하위 형변환시 명시필요
        // 자료형이 달라서 형변환을 해주었다고 생감
        HttpServletRequest request = (HttpServletRequest) req;

        /* 로그인 상태, 로그인 회원 정보 전역 유지 */
        boolean isLogin = MemberUtil.isLogin(request);
        Member member = MemberUtil.getMember(request);

        request.setAttribute("isLogin", isLogin);
        request.setAttribute("loggedMember", member);
    }
}
