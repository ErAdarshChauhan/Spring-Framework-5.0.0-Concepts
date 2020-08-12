<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Register</title>
    <style type="text/css">
        table {
            width: 1000px;
            margin: auto;
        }

        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }

        table, td {
            text-align: center;
        }

        .button {
            background-color: teal;
            color: white;
        }

        .buttonDelete {
            background-color: red;
            color: white;
        }
    </style>
</head>
<body>
<h3>
    <center>Search Employee</center>
</h3>
<hr>
<div align="center">${msg}</div>
<br/>
<div align="center">
    <form action="searchEmployee" method="post">
        Id : <input type="text" name="employeeId">
        Name : <input type="text" name="employeeName">
        Email : <input type="text" name="email">
        Address : <input type="text" name="address">
        <input type="submit" value="Register">

    </form>
</div>
<br/>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach var="tab" items="${data}">
        <tr>
            <td>${tab.employeeId}</td>
            <td>${tab.employeeName}</td>
            <td>${tab.email}</td>
            <td>${tab.address}</td>
        </tr>
    </c:forEach>
</table>

<br/>
<div align="center"><a href="/">Home Page</a></div>
</body>
</html>