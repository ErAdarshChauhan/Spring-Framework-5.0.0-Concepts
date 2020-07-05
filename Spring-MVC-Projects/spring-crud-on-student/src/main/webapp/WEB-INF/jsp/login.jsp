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
  			width: 400px;
  			margin: auto;
  	}
  	
  	.errors{
  		color: red;
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
    </ul>
  </div>
</nav>
  
<div class="container">
  <h3>Login Student</h3>
  <div class="text-success text-center">
  	  ${msg}
  </div>
  <div align="center">
  
  		<form:form action="loginStudent" method="post" modelAttribute="studentBean">
  		  
  			<table border="0">
				  <tr>
				   <div class="form-group">
				    <td><form:label path="studentName">Student Name: </form:label></td>
				    <td>
				    	<form:input path="studentName"/>
				    	<span>
							<form:errors path="studentName" cssClass="errors"/>
						</span>
				    </td>
				   </div>
				  </tr>
				  <tr>
				   <div class="form-group">
				    <td><form:label path="email">E-mail: </form:label></td>
				    <td><form:input path="email"/></td>
				   </div>
				  </tr>
				  
				  <tr>
				   <div class="form-group">
				   <td colspan="2"  align="center"><input type="submit" value="Register" class="btn btn-primary" /></td>
				   </div>
				  </tr>
			</table>
	
  			</div>
  		</form:form>
  </div>
  
</div>

</body>
</html>