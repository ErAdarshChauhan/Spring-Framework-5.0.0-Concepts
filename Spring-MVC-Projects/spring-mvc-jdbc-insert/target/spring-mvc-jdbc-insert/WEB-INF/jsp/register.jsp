<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>ChauhanSoft</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">ChauhanSoft India PVT LTD</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="">Home</a></li>
      <li><a href="register">Register</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
  <h3>Register Student</h3>
  <div>
  	  <form:form action="studentRegister" method="post" modelAttribute="studentBean">
  	  	<table>
  	  		<tr>
  	  			<td>Student Id : </td><td><form:input path="studentId"/></td>
  	  		</tr>
  	  		<tr>
  	  			<td>Student Name : </td><td><form:input path="studentName"/></td>
  	  		</tr>
  	  		<tr>
  	  			<td>Email : </td><td><form:input path="email"/></td>
  	  		</tr>
  	  		<tr>
  	  			<td>Age : </td><td><form:input path="age"/></td>
  	  		</tr>
  	  		<tr>
  	  			<td>Course : </td><td><form:input path="course"/></td>
  	  		</tr>
  	  		<tr>
  	  			<td colspan="2" align="center"><form:button value="Register"/></td>
  	  		</tr>
  	  	</table>
  	  </form:form>
  	  ${msg}
  </div>
</div>

</body>
</html>
