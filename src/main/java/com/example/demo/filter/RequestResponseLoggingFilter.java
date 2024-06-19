package com.example.demo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class RequestResponseLoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;


        log.warn("Request  {} : {} : {} : IP {}", req.getMethod(), req.getRequestURI(), req.getProtocol(), req.getRemoteAddr());

        filterChain.doFilter(servletRequest, servletResponse);

        log.warn("Response :{} ", res.getStatus());
    }

}
