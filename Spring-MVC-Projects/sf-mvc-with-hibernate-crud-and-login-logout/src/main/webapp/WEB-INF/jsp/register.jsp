<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Register | ChauhanSoft</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style type="text/css">
  	.navbar-align{
  		float: right;
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
      <li class="active"><a href="register">Register Employee</a></li> 
 	  <li class="active"><a href="search">Search Employee</a></li>
 	  <li class="active"><a href="displayEmployee">Display All Employee</a></li>
 	  <li class="active"><a href="logout">Logout</a></li>
    </ul>
  </div>
</nav>
  
 
<div class="container">
  <h3>Employee Register</h3>
  <p>
  		<form:form action="registerEmployee" method="post" modelAttribute="employeeBeanRegister">
  			<table>
			  <tr>
			     <div class="form-group">
			     	<td><form:label path="employeeName">Employee Name : </form:label></td>
			     	<td><form:input path="employeeName" /></td>
			     </div>
			  </tr>
			  <tr>
			     <div class="form-group">
			     	<td><form:label path="email">Email : </form:label></td>
			     	<td><form:input path="email" /></td>
			     </div>
			  </tr>
			  <tr>
			     <div class="form-group">
			     	<td><form:label path="password">Password : </form:label></td>
			     	<td><form:input path="password" /></td>
			     </div>
			  </tr>
			  <tr>
			     <div class="form-group">
			     	<td><form:label path="address">Address : </form:label></td>
			     	<td><form:input path="address" /></td>
			     </div>
			  </tr>
			  <tr>
			     <div class="form-group">
			     	<td colspan="2" align="center"><input type="submit" value="Register" class="btn btn-primary"/></td>
			     </div>
			  </tr>
			</table>
		
			<br><br>
			<div class="form-group">
				${msg}
			</div>
  		
  		</form:form>
  </p>
</div>

</body>
</html>
