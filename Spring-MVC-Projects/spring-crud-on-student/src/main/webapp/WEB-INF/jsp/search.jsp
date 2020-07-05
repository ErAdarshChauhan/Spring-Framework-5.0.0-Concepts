<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>ChauhanSoft</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style type="text/css">
  	.navbar-align{
  		float: right;
  	}
  	table{
  			width: 1324px;
  			margin: auto;
  	}
  	.errors{
  		color: red;
  	}
  	.button{
  		width: 85%;
  		border-radius: 20px;
  	}
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand text-white" href="#">ChauhanSoft</a>
    </div>
    <ul class="nav navbar-nav navbar-align">
      <li class="active"><a href="home">Home</a></li>
      <li><a href="register">Register</a></li>
      <li><a href="search">Search Student</a></li>
      <li><a href="advancedSearch">Advanced Search</a></li>
    
 	  <li class="active"><a href="logout">Logout</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
  <h3>Find the Student</h3>
  <div class="text-success text-center">
  	  ${msg}
  </div>
  <div class="">
  
  		<form:form action="findStudent" method="post" modelAttribute="searchStudent">
  		  
  			<table border="0">
				  <tr>
				   <div class="form-group">
				    <td><form:label path="studentId">Enter Student Id: </form:label></td>
				    <td><form:input path="studentId"/></td>
				   </div>
				  </tr>
				  <tr>
				     <br>
				   <div class="form-group">
				   <td colspan="2"  align="center"><input type="submit" value="Search" class="btn btn-primary" /></td>
				   </div>
				  </tr>
			</table>
	
  			</div>
  		</form:form>
  		
  		<br><br>
 	<table style="border-collapse:collapse;border: 1px solid black;">
 	     <tr style="border-collapse:collapse;border: 1px solid black;background-color: black;color: white;">
  			<th style="text-align: center;">Student Id</th>
  			<th style="text-align: center;">Student Name</th>
  			<th style="text-align: center;">Email</th>
  			<th style="text-align: center;">Course</th>
  			<th style="text-align: center;">Category</th>
  			<th style="text-align: center;">&nbsp;&nbsp;Action&nbsp;&nbsp;</th>
  		</tr>
  		<c:forEach var="tab" items="${data}">
  		<form:form action="editStudent" method="post" modelAttribute="searchStudent">
  		
  		<tr style="border-collapse:collapse;border: 1px solid black;">
  		 <div class="form-group">
  		  <td style="border-collapse:collapse;border: 1px solid black;text-align: center;"><form:input path="studentId" value="${tab.studentId}" readonly="true"/></td>
  		  <td style="border-collapse:collapse;border: 1px solid black;text-align: center;"><form:input path="studentName" value="${tab.studentName}"/></td>
  		  <td style="border-collapse:collapse;border: 1px solid black;text-align: center;"><form:input path="email" value="${tab.email}"/></td>
  		  <td style="border-collapse:collapse;border: 1px solid black;text-align: center;"><form:input path="course" value="${tab.course}"/></td>
  		  <td style="border-collapse:collapse;border: 1px solid black;text-align: center;"><form:input path="category" value="${tab.category}"/></td>
  		  <td style="border-collapse:collapse;border: 1px solid black;text-align: center;">
  		  	<input type="submit" class="btn btn-primary button" value="Update"/>&nbsp;
  		  	</form:form>
  		  	<form:form action="deleteStudent" method="post" modelAttribute="searchStudent">
  		  		<form:hidden path="studentId" value="${tab.studentId}" readonly="true"/>
  		  		<input type="submit" class="btn btn-danger button" value="Delete"/>
  		  	</form:form>
  		  </td>
  		</div>
  		</tr>
  		</c:forEach>
  	</table>
</div>
  </div>
  
</body>
</html>