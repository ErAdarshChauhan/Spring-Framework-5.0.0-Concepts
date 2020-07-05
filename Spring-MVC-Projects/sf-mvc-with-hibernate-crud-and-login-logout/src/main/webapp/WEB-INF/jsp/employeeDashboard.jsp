<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Employee Dashboard | ChauhanSoft</title>
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
	<link rel="stylesheet" href="<c:url value="/static/css/cssFile.css"></c:url>">
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
  <h3>Employee Dashboard</h3>
  <p>Welcome <strong>${username}</strong> to the ChauhanSoft Pvt. Ltd.</p>
</div>
<img alt="image" src='<c:url value="/static/images/loading5.gif"></c:url>' width="5%" height="5%"/>
</body>
</html>
