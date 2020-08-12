<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home Page</title>
</head>
<body>
<div align="center"><h2>Register Employee</h2></div>
<hr/>
<div align="center">
    <h5>${msg }</h5>
    <form action="registerEmployee" method="post">
        Employee Id : <input name="employeeId"><br/>
        Name : <input name="employeeName"><br/>
        E-mail : <input name="email"><br/>
        Address : <input name="address"><br/>
        <input type="submit" value="Register"><br/>
    </form>
    <br/>
    <a href="/">Goto Home</a>
</div>
</body>
</html>