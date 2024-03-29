package com.ajfqo.servlet.database.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajfqo.servlet.common.MysqlService;
@WebServlet("/database/ex01")
public class Ex01Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();	
		
//		MysqlService mysqlService = new MysqlService();
		// mysql 접속
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		ResultSet resultSet = mysqlService.select("SELECT * FROM `used_goods`;");
		
		out.println("<html><head><title>중고 매물 목록</title><head><body>");
		
		// <div>제목 : 플스 팝니다. 가격 : 30000원</div>
		
		try {
			while(resultSet.next()) {
				String title = resultSet.getString("title");
				int price = resultSet.getInt("price");
				
				out.println("<div>제목 : " + title + " 가격 : " + price + "원</div>");
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String insertQuery = "INSERT INTO `used_goods`\r\n"
				+ "(`sellerId`, `title`, `price`, `description`)\r\n"
				+ "value\r\n"
				+ "(3, '고양이 간식 팝니다', 2000, '저희 고양이가 안먹어서 팔아요');";
		
		int count = mysqlService.update(insertQuery);
		out.println("<div>실행결과 : " + count + "</div>");
		
		out.println("</body></html>");
		
		// 데이터베이스 접속
//		try {
//			// 드라이버 등록
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			
//			String url = "jdbc:mysql://localhost:3306/mega_lhy";
//			String userId = "root";
//			String password = "root";
//			
//			// 접속
//			Connection connection = DriverManager.getConnection(url, userId, password);
//			// 접속 정보를 통해서 쿼리를 실행시킬수 있는 객체를 얻어옴.
//			Statement statement = connection.createStatement();
//			
//			String selectQuery = "SELECT * FROM `used_goods`;";
//			
//			ResultSet resultSet = statement.executeQuery(selectQuery);
//			
//			out.println("<html><head><title>중고 매물 목록</title><head><body>");
//			
//			// <div>제목 : 플스 팝니다. 가격 : 30000원</div>
//			
//			while(resultSet.next()) {
//				String title = resultSet.getString("title");
//				int price = resultSet.getInt("price");
//				
//				out.println("<div>제목 : " + title + "가격 : " + price + "원</div>");
//				
//			}
//			out.println("</body></html>");
//			
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
		
		
	}
	
}
