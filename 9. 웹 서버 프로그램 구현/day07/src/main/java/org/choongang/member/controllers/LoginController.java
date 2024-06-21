package org.choongang.member.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;
import org.choongang.member.services.LoginService;
import org.choongang.member.services.MemberServiceProvider;

import java.io.IOException;

import static org.choongang.global.MessageUtil.*;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // get 방식일 때는 버퍼를 치환하는 방식으로 작동 forward
        // 가져오는 객체가 getRequestDispatcher
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/member/login.jsp");
        rd.forward(req, resp);
    }

    // 예외 있으면 실패, 예외가 있으면 성공 -> 잘 처리 된 것
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            LoginService service = MemberServiceProvider.getInstance().loginService();
            service.process(req); // 여기서 예외 발생시 하단 코드 실행 안 되고 catch로 유입,, 그 반대면 하단 코드 실행(이상 없다는 것 - 로그인이 잘 이루어짐)

            /* 이메일 기억하기 처리 S */
            // 쿠키는 암호화가 필요하기 때문에 단순 쿠키 사용은 불안정하지만 배우는 단계이므로 작성해보는 이메일 쿠키 저장 기능
            String email = req.getParameter("email");
            Cookie cookie = new Cookie("saveEmail", email);
            if (req.getParameter("saveEmail") != null) { // 이메일 기억하기 체크
                // 7일간 기억하기
                cookie.setMaxAge(60 * 60 * 24 * 7);
            } else { // 체크 해제 - 쿠키 제거
                cookie.setMaxAge(0);

            }
                resp.addCookie(cookie);
            /* 이메일 기억하기 처리 E */

            go(req.getContextPath() + "/", "parent", resp);
        } catch (CommonException e) {
            alertError(e, resp);
        }

    }
}