package com.ajfqo.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// 해당 필터를 거쳐갈 요청주소 형식
// @WebFilter("/servlet/*")
@WebFilter("/*")
public class EncodingFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		// 필터들이 여러개 만들어졌을때 연결성을 가지게 하는 코드
		chain.doFilter(request, response);
	}
	
}
