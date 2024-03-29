package com.ajfqo.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/ex05")
public class Ex05Controller extends HttpServlet{
	// doPost 메소드를 사용하는 경우는 
	// 파라미터가 중요한 정보여서 보여지면 안되는 경우, 파라미터가 너무 길경우, 파일을 보내는경우
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		
		// 이름과 생년월일 전달받고, 이름과 나이를 html로 response에 담는다.
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일 전달받고,
		// 이름과 나이를 보여주는 페이지 작성
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");  // 19990115
		
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		// 한국나이
		int age = 2024 - year + 1;
		
		out.println("<html><head><title>이름 나이</title></head><body>");
		out.println("<h2>이름 : " + name + "</h2>");
		out.println("<h2>나이 : " + age + "</h2>");
		out.println("</body></html>");
		
	}
	
}
