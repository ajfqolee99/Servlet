<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<header class="d-flex">
			<div class="logo d-flex align-items-center">
				<h1 class="text-success">Melong</h1>
			</div>
	        <div class="search d-flex align-items-center">
	        
	        	<form method="get" action="/jspT/test/test02/detail.jsp">
					<div class="input-group col-10">
						<input type="text" class="form-control" name="title">
			            <div class="input-group-append ">
			           		<button class="btn btn-success" type="submit">검색</button>
		        		</div>
					</div>
				</form>
				
	        </div>
		</header>