package org.choongang.global;

import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;

import java.io.IOException;
import java.io.PrintWriter;

public class MessageUtil {
    public static void alertError(Exception e, HttpServletResponse resp) throws IOException {
        // 브라우저에게 contentType 형식을 알려줘야 됨
        resp.setContentType("text/html; charset=UTF-8");
        if (e instanceof CommonException commonException) {
            // 위에 commonException 추가로 동일한 기능
            // 어차피 형변환 할 거기 때문에 뒤에 명시만 해줘도 명시적 형변환 가능
            // CommonException commonException = (CommonException)e;
            resp.setStatus(commonException.getStatus());
        }
        PrintWriter out = resp.getWriter();
        out.printf("<script>alert('%s');</script>", e.getMessage());
    }

    public static void go(String url, String target, HttpServletResponse resp) throws IOException {
        target = target == null || target.isBlank() ? "self" : target;

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        /**
         * location.href : 주소 이동시 이동 기록이 남는다, 뒤로가기 버튼을 누른 경우
         * POST 처리가 중복 된다.
         * POST 처리시 이동할 때는 기록을 남기지 않는 이돟 방식 location.replace(..)
         */
        // out.printf("<script>%s.location.href='%s';</script>", target, url);
        out.printf("<script>%s.location.replace('%s');</script>", target, url);
    }

    public static void go(String url, HttpServletResponse resp) throws IOException {
        go(url, "self", resp);
    }
}
