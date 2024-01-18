<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Method - form 태그</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

	<%
		int cm = Integer.parseInt(request.getParameter("cm"));
		int kg = Integer.parseInt(request.getParameter("kg"));
		
		double bmi = kg / ((cm / 100.0) * (cm / 100.0));
		String value = "";
		
		if(bmi < 18.5) {
			value = "저체중";
		} else if(bmi < 25) {
			value = "정상";
		} else if(bmi < 30) {
			value = "과체중";
		} else {
			value = "비만";
		}
	%>
	
	<div class="container">
		<h1>BMI 측정 결과</h1>	
		<div class="d-flex display-4">당신은 <div class="text-info"> &nbsp;<%= value %></div>입니다.</div>
		<div>BMI 수치 : <%= bmi %></div>
	</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>