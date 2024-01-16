package com.ajfqo.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test06")
public class Test06Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		// 두수를 전달받는다.
		String num1String = request.getParameter("number1");
		String num2String = request.getParameter("number2");
		
		int num1 = Integer.parseInt(num1String);
		int num2 = Integer.parseInt(num2String);
		
		// {"number1":120, "number2":15}
		out.println("{\"addtion\" : " + (num1 + num2) + ", \"subtraction\" : " + (num1 - num2)  + ", \"multiplication\" : " + (num1 * num2)  + ", \"division\" : " + (num1 / num2) + "}");
		
	}
	
}
