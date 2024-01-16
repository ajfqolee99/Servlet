package com.ajfqo.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test07")
public class Test07Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 주소, 결제카드, 가격 전달받기
		String address = request.getParameter("address");
		String card = request.getParameter("card");
//		String price = request.getParameter("price");
		int price = Integer.parseInt(request.getParameter("price"));
		
		out.println("<html><head><title>배달주문</title></head><body>");
		if(!address.contains("서울시")) {
			out.println("<h3>배달불가 지역입니다.</h3>");
		} else if(card.equals("신한카드")){
			out.println("<h3>결제 불가 카드입니다.</h3>");
		} else {
			out.println(address + " 배달준비중" + "<hr>");
			out.println("결제금액 : " + price + "원");
		}
		out.println("</body></html>");

	}
	
}
