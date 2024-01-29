package com.ajfqo.servlet.database.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajfqo.servlet.common.MysqlService;
@WebServlet("/database/test01")
public class Test01Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();	
		
//		MysqlService mysqlService = new MysqlService();
		// mysql 접속
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		//String selectQuery = "SELECT * FROM `real_estate` ORDER BY `id` DESC LIMIT 10;";
		ResultSet resultSet = mysqlService.select("SELECT * FROM `real_estate` ORDER BY `id` DESC LIMIT 10;");
		
		try {
			// 원하는 조회 결과로 만드는 과정
			while(resultSet.next()) {
				// real_estate 테이블에서 조회한 데이터를 보여줄 값들만 뽑아서 보여주는 과정
				String address = resultSet.getString("address");
				int area = resultSet.getInt("area");
				String type = resultSet.getString("type");
				
				out.println("매물 주소 : " + address + " 면적 : " + area + " 타입 : " + type);
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		// 실행할때마다 계속 인서트 되기때문에 한번만 실행하고 주석처리
//		String insertQuery = "INSERT INTO `real_estate`\r\n"
//				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)\r\n"
//				+ "value\r\n"
//				+ "(3, '헤라펠리스 101동 5305호 ', 350, '매매', 1500000, NULL);";
//		
//		int count = mysqlService.update(insertQuery);
//		out.println("실행결과 : " + count);
		
	}
	
}
