package com.ajfqo.servlet.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Mysql jdbc의 사용 과정에 복잡한 코드를 간결하게 사용하도록
// 메소드로 정리하는 역할
public class MysqlService {
	
	// 객체생성 없이 사용할 수 있는 멤버변수여야 getInstance안에서도 사용할 수 있음.
	// static이 없으면 객체가 생성된 후에 사용할 수 있는 멤버변수이기 때문에
	// 언제 사용될지 모르기 때문에 프로그램이 수행되는 순간부터 준비할 수 없음 
	// static을 무분별하게 사용하게 되면 메모리 낭비가 있을수 있기 때문에 필요할때만.
	private static MysqlService mysqlService = null;
	
	private Connection connection;
	private Statement statement;
	
	// 디자인 패턴
	// Singleton 패턴
	// 객체 관리 메소드
	// 한 클래스 안에서 동일한 객체가 여러번 생성되어 사용되면 안되는 것들은
	// 한번만 생성하여 사용할수 있게 설계한다.
	// 처음에 mysqlService에 null값을 저장해주고 mysqlService이 null이면 
	// 새로운 mysqlService객체를 생성.
	// 이미 있으면 기존에 있는 mysqlService객체를 리턴
	// 리턴타입 앞에 static 키워드를 붙여주면 해당하는 메소드는 객체생성없이 사용할 수 있음.
	public static MysqlService getInstance() {
		
		if(mysqlService == null) {
			mysqlService = new MysqlService();
		}
		
		return mysqlService;
		
	}
	
	
	// 접속기능
	public void connect() {
		
		// 드라이버 등록
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			String url = "jdbc:mysql://localhost:3306/mega_lhy";
			String userId = "root";
			String password = "root";
			
			// 접속
			connection = DriverManager.getConnection(url, userId, password);
			// 접속 정보를 통해서 쿼리를 실행시킬수 있는 객체를 얻어옴.
			statement = connection.createStatement();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	// select 쿼리 수행기능
	public ResultSet select(String query) {
		
		ResultSet resultSet;
		try {
			resultSet = statement.executeQuery(query);
			return resultSet;
		} catch (SQLException e) {

			e.printStackTrace();
			
			return null;
		}

	}
	
	// insert, update, delete 쿼리 수행기능
	public int update(String query) {
		
		// 실행된 행의 개수
		try {
			int count = statement.executeUpdate(query);
			return count;
		} catch (SQLException e) {

			e.printStackTrace();
			
			return -1;
		}
		
	}
	
	
	
	// 데이터베이스 접속 끊기
	public void disconnect() {
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
