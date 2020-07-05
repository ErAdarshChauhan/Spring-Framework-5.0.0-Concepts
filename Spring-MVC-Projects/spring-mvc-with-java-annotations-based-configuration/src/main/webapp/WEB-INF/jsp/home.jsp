<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href='<spring:url value="/resources/css/bootstrap.min.css"/>' />
<link rel="stylesheet" href='<spring:url value="/resources/css/mystyle.css"/>' />
<script type="text/javascript" src='<spring:url value="/resources/js/bootstrap.min.js"/>' ></script>
<script type="text/javascript" src='<spring:url value="/resources/js/jquery-3.4.1.js"/>' ></script>
</head>
<body>
		<img alt="image" src='<spring:url value="/resources/images/1.jpg"></spring:url>' width="100%" height="400px">
		<br><br>
		<div class="form-group text-center">
		
			<a href="register" class="text-black" class="form-control">Register</a>&nbsp;&nbsp;
			<a href="display" class="text-black" class="form-control">Display</a>&nbsp;&nbsp;
			<a href="search" class="text-black" class="form-control">Search</a>&nbsp;&nbsp;
		
		</div>
		
		
		<script type="text/javascript">
		$(document).ready(function(){
			$('a').css({
				"background-color":"none",
				"color":"white",
				"width":"200px"
			});
		});

		</script>
</body>
</html>


