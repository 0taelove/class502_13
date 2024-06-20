package org.choongang.member.controllers;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.MemberServiceProvider;

import java.io.IOException;

@WebServlet("/member/join")
public class JoinController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // get 방식일 때는 버퍼를 치환하는 방식으로 작동 forward
        // 가져오는 객체가 getRequestDispatcher
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/member/join.jsp");
        rd.forward(req, resp);
    }

    // doGet에서 날아온 데이터 -> service를 doPost에 추가
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JoinService service = MemberServiceProvider.getInstance().joinService();

        // 매개변수로 req 사용 -> 실제 요청데이터는 req에 있으니 가공해서 사용하겠다는 의미
        // service 데이터 -> controller로 유입(사용자 요청 데이터 req에 있음)
        service.process(req);
    }
}