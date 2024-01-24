<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멜롱</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
	
	<div id="wrap" class="container">
		<header class="d-flex">
			<div class="pt-4"><h3 class="text-success">Melong</h3></div>
	        <div class="input-group mb-5 col-6 p-0 ml-5 pt-4">
	          <input type="text" class="form-control">
	          <div class="input-group-append ">
	            <button class="btn btn-info" type="button">검색</button>
	          </div>
	        </div>
		</header>
		<nav class="main-menu">
			<ul class="nav">
				<li class="nav-item"><a class="nav-link text-black-50" href="#">멜롱차트</a></li>
				<li class="nav-item"><a class="nav-link text-black-50" href="#">최신음악</a></li>
				<li class="nav-item"><a class="nav-link text-black-50" href="#">장릉음악</a></li>
				<li class="nav-item"><a class="nav-link text-black-50" href="#">멜롱DJ</a></li>
				<li class="nav-item"><a class="nav-link text-black-50" href="#">뮤직어워드</a></li>
			</ul>
		</nav>
		<section class="contents">
			<div class="artist border border-info d-flex">
				<div class="p-1">
					<img width="90px" src="data:image/jpeg;base64,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">
				</div>
				<div>
					<div class="mt-1"><h5>아이유</h5></div>
					<div>EDAM엔터테이먼트</div>
					<div>2008년 데뷔</div>
				</div>
			</div>
			<div class="list">
				<h5 class="mt-2">곡 목록</h5>
				<table class="table text-center">
					<thead>
						<tr>
							<th>no</th>
							<th>제목</th>
							<th>앨범</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>팔레트</td>
							<td>팔레트</td>
						</tr>
						<tr>
							<td>2</td>
							<td>좋은날</td>
							<td>좋은날</td>
						</tr>
					</tbody>
				</table>
			</div>
		</section>
		<footer>
			<div>Copyright 2024. Melong All Rights Reserved.</div>
		</footer>
	
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
	
</body>
</html>