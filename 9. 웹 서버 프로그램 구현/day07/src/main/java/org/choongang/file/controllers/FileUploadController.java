package org.choongang.file.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload2.core.DiskFileItem;
import org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletDiskFileUpload;

import java.io.IOException;
import java.util.List;

// 서블릿을 구현하기 위해서는 HttpServlet 추상 클래스를 상속받아야 한다
@WebServlet("/file/upload")
public class FileUploadController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/file/upload.jsp");
        rd.forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JakartaServletDiskFileUpload upload = new JakartaServletDiskFileUpload();
        // multipart 형식 body 데이터를 일반 양식과 파일 데이터로 분리해서 조회 가능한 List 형태로 변환
        List<DiskFileItem> items = upload.parseRequest(req);
        for (DiskFileItem item : items) {

            if (item.isFormField()) { // 일반 텍스트 형태의 양식 데이터
                // subject, content

            } else { // 파일 데이터 - file

            }
        }
    }
}
