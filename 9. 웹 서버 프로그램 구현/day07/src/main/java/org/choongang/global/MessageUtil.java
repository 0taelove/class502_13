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
}
