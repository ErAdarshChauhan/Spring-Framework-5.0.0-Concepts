<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isErrorPage="false" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
<script src="jquery-3.4.1.js"></script>
<script type="text/javascript">
	/* $(document).ready(function() {
		alert("Hi");
	}); */
</script>
<style type="text/css">
table {
	margin: auto;
	width: 600px;
}

table, td, tr {
	border: 1px solid black;
	border-collapse: collapse;
}
th{
	background-color: black;
	color: white;
}
</style>
</head>
<body>
		<table>
		   <tr>
		   		<th>Id</th>
		   		<th>Name</th>
		   		<th>Email</th>
		   		<th>Designation</th>
		   </tr>
		   <c:forEach var="tab" items="${data}"> 
		   		<tr align="center">
		   			<td>${tab.employeeId}</td>
		   			<td>${tab.employeeName}</td>
		   			<td>${tab.email}</td>
		   			<td>${tab.designation}</td>
		   		</tr>
		   </c:forEach>	   
	  </table>	
	<h5 align="center">${msg}</h5>
</body>
</html>