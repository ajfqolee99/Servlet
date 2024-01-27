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
		
		ResultSet resultSet = mysqlService.select("SELECT * FROM `real_estate` ORDER BY `id` DESC LIMIT 10;");
		
		try {
			while(resultSet.next()) {
				String address = resultSet.getString("address");
				int area = resultSet.getInt("area");
				String type = resultSet.getString("type");
				
				out.println("매물 주소 : " + address + " 면적 : " + area + " 타입 : " + type);
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String insertQuery = "INSERT INTO `real_estate`\r\n"
				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)\r\n"
				+ "value\r\n"
				+ "(3, '헤라펠리스 101동 5305호 ', 350, '매매', 1500000, NULL);";
		
		int count = mysqlService.update(insertQuery);
		out.println("실행결과 : " + count);
	
		
	}
	
}
