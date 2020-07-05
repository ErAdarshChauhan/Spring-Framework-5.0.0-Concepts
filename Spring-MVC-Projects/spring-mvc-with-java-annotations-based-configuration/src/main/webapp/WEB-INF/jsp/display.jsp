<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isErrorPage="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Students</title>
<style type="text/css">
	table{
			width: 1000px;
			margin: 0px auto;
	}
	table,th,td{
		border: 1px solid black;
		border-collapse: collapse; 
	}
	th{
		background-color: black;
		color: white;
	}
	td{
		text-align: center;
	}

</style>
</head>
<body>
		
		
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4">
					<div class="form-group">
						<table class="table">
						  <tr>
						    <th>Id</th>
						    <th>Name</th>
						    <th>Email</th>
						    <th>Address</th>
						    <th>Country</th>
						    
						  </tr>
						  <c:forEach var="tab" items="${data}">
						  	<tr>
						    <td>${tab.studentId}</td>
						    <td>${tab.studentName}</td>
						    <td>${tab.email}</td>
						    <td>${tab.address}</td>
						    <td>${tab.country}</td>
						  </tr>
						  </c:forEach>
						  
						</table>

					</div>
				</div>
				<div class="col-sm-4"></div>
			</div>
		</div>
</body>
</html>