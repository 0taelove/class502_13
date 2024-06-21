package org.choongang.file.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;

@WebServlet("/file/download")
public class FileDownloadController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("D:/uploads/JS.jpeg");
        String contentType = Files.probeContentType(file.toPath());
        // 윈도우즈에서 한글 깨짐문제 발생, 인코딩 UTF-8 -> CPC949, EUC-KR, ISO8859_1
        String fileName = new String(file.getName().getBytes(), "ISO8859_1");

        // 다운로드 할 때 중요한 응답 헤더 Content-Disposition
        // 출력을 화면이 아닌 파일쪽으로 방향을 바꿈
        resp.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        resp.setContentType(contentType);
        // 네트워크를 거치지 않고 캐시화된 데이터를 사용자에게 제공해줌
        resp.setHeader("Cache-Control", "must-revalidate");
        // 완료 시간 없애야함 -> 리소스가 이미 만료되었음을 의미
        resp.setIntHeader("Expires", 0);
        // 파일 길이
        resp.setContentLengthLong(file.length());

        // BufferedInputStream : byte단위로 파일을 읽어 올때 사용
        // etOutputStream : 파일의 데이터를 Http 응답의 바디에 사용 가능 -> 브라우저는 해당 응답을 받아 파일을 다운 받음
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            OutputStream out = resp.getOutputStream();
            out.write(bis.readAllBytes());
        }
    }
}
