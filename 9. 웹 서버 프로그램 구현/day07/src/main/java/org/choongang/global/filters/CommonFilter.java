package org.choongang.global.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/*") // 필터를 등록하고 설정하는 어노테이션
public class CommonFilter implements Filter {
    // 필터를 만들 때는 doFilter 필수가결
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 전역에 Filter 적용
        chain.doFilter(new CommonRequestWrapper(request), response);
    }
}
