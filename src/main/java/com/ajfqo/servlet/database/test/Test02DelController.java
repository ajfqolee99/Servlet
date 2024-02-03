package com.ajfqo.servlet.database.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajfqo.servlet.common.MysqlService;
@WebServlet("/database/site/delete")
public class Test02DelController extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 사용자가 input하는 화면에서 받아올 파라미터 설정
		String id = request.getParameter("id");
		
		// Mysql에 연결해서 전달받은 파라미터로 insert 구문 작성
		MysqlService mysqlservice = MysqlService.getInstance();
		mysqlservice.connect();
		
		mysqlservice.update("DELETE FROM `site` WHERE `id` = " + id + ";");
		
		// 전달받은 파라미터로 테이블에 데이터가 인서트되면 조회된 결과를 볼수있는 페이지로 이동
		response.sendRedirect("/database/site-list.jsp");
		
	}
}