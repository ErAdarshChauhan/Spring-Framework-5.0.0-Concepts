<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Register</title>
</head>
<body>
<h5>
    <center>Register Employee</center>
</h5>
${msg}

<form action="insertEmployee" method="post">
    Employee Name : <input type="text" name="employeeName"><br/>
    Email : <input type="text" name="email"><br/>
    Address : <input type="text" name="address"><br/>
    <input type="submit" value="Register">

</form>
<br/>
<div align="center"><a href="/">Home Page</a></div>
</body>
</html>