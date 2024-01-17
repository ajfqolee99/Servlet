<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 스크립트 요소</title>
</head>
<body>
	
	<h1>1. 점수들의 평균 구하기</h1>
	<%
		int sum = 0;
		double avg = 0;
		int[] scores = {80, 90, 100, 95, 80};
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum / scores.length;
	%>
	<h3>점수 평균은 <%= avg %> 입니다.</h3>
	
	<h1>2. 채점 결과</h1>
	<%
		sum = 0;
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		for(int i = 0; i < scoreList.size(); i++) {
			if(scoreList.get(i).equals("O")) {
				sum += 10;
			}
		}
	%>
	<h3>채점결과는 <%= sum %>점 입니다.</h3>
	
	<h1>3. 1부터 n까지의 합계를 구하는 함수</h1>
	<%!
		public Integer getSum(int number) {
			int sum = 0;
			for(int i = 1; i <= number; i++) {
				sum += number;
			}
			return sum;
		}
	%>
	<h3>1에서 50까지의 합은 <%= getSum(50) %></h3>
	
	<h1>4. 나이 구하기</h1>
	<%
		String birthDay = "20010820";
		int year = Integer.parseInt(birthDay.substring(0, 4));
		int age = 2024 - year + 1;
	%>
	<h3>20010820의 나이는 <%= age %>살 입니다.</h3>
	
</body>
</html>