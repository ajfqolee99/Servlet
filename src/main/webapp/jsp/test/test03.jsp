<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Method - link</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	
	<%
        // 선생님 해설
        Date now = new Date();
		SimpleDateFormat = dateFormatter = new SimpleDateFormat("yyyy년 M월 d일");
		SimpleDateFormat = timeFormatter = new SimpleDateFormat("HH시 mm분 ss초");
        
        String dateString = "오늘 날짜" + dateFormatter.format(now);
        String timeString = "현재 시간" + timeFormatter.format(now);
        
        // what 파라미터
        // "date" 날짜
        // "time" 시간
        String what = request.getParameter("what");
        
        String resultString = null;
        if(what.equals("date")) {
        	resultString = dateString;	
        } else {
        	resultString = timeString;	
        }
        
	%>
	
	<div class="container">
		<div class="display-4"><%= resultString %></div>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>