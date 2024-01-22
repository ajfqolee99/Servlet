<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST Method 2</title>
</head>
<body>

	<%
		int length = Integer.parseInt(request.getParameter("length"));
		String[] units = request.getParameterValues("unit");
		
		String unitString = ""; 
		
		for(int i = 0; i < units.length; i++) {
			if(units[i].equals("inch")) {
				double inch = length / 2.54;
				unitString += (inch + "in<br>");
			} else if(units[i].equals("yard")) {
				double yard = length / 91.44;
				unitString += (yard + "yd<br>");
			} else if(units[i].equals("feet")) {
				double feet = length / 30.48;
				unitString += (feet + "ft<br>");
			} else if(units[i].equals("meter")) {
				double meter = length / 100.0;
				unitString += (meter + "m<br>");
			}
		}
	
	%>
	
	<h3>변환 결과</h3>
	<h5><%= length %>cm</h5>
	<hr>
	<h5><%= unitString %></h5>
	
	
</body>
</html>