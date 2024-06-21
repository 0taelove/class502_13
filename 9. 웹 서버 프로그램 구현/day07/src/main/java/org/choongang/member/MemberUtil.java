package org.choongang.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.choongang.member.entities.Member;

public class MemberUtil {

    public static boolean isLogin(HttpServletRequest request) {

        // 값이 있으면 로그인 상태 없으면 비로그인 상태
        return getMember(request) != null;
    }

    // 로그인한 세션쪽 값을 가져와서 member(회원정보) 정보
    public static Member getMember(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Member member = (Member)session.getAttribute("member");

        return member;
    }
}
