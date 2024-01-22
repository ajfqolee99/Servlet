<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post method</title>
</head>
<body>

	<%
		// 닉네임을 전달 받고 보여주는 기능
		String nickname = request.getParameter("nickname");
		
		// 좋아하는 과일
		String fruit = request.getParameter("fruit");
		
		// 좋아하는 동물
		String animal = request.getParameter("animal");
		
		// 좋아하는 음식
		//String food = request.getParameter("food");	// 문자열 하나만 전달받을 수 있음
		String[] foods = request.getParameterValues("food");
		
		String foodString = "";
		for(int i = 0; i < foods.length; i++) {
			foodString += foods[i] + " ";
		}
		
	%>

	<h3><%= nickname %></h3>
	<h3><%= fruit %></h3>
	<h3><%= animal %></h3>
	<h3><%= foodString %></h3>

</body>
</html>