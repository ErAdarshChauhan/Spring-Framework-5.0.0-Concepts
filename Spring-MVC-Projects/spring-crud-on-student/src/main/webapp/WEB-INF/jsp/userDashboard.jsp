<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
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
  <h3>Student Dashboard</h3>
  <p>${msg}</p>
</div>

</body>
</html>
