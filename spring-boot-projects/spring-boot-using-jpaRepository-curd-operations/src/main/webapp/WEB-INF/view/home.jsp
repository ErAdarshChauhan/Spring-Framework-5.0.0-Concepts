<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<script src="jquery-3.4.1.min.js"></script>
<script type="text/javascript">

		$(document).ready(function(){
			alert("Hi");
		});
       </script>
</head>
<body>
       This is Spring JPA Home Page.
       <br>
       
       <form action="getAllStudent">
       		student id : <input name="studentId"><br>
       		student name : <input name="studentName"><br>
       		student email : <input name="email"><br>
       		student course : <input name="course"><br>
       
       		<input type="submit" value="Register">
       </form>
       
       
</body>
</html>