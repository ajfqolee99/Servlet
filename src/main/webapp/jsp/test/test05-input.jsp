<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	
	<div class="container">
		<form method="post" action="/jsp/test/test05.jsp">
			<h3>길이 변환</h3>
			<div class="d-flex align-items-end">
				<input type="text" name="length" class="form-control">
				<div>cm</div>
			</div>
			
			<label><input type="checkbox" name="unit" value="inch">인치</label>
			<label><input type="checkbox" name="unit" value="yard">야드</label>
			<label><input type="checkbox" name="unit" value="feet">피트</label>
			<label><input type="checkbox" name="unit" value="meter">미터</label>
			<button type="submit" class="form-control btn-info">변환</button>
		</form>
	</div>
	
	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
	
</body>
</html>