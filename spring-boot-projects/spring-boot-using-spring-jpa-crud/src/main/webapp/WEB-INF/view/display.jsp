<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1" %>
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
<h2>
    <center>All Employees</center>
</h2>
<hr/>
<div align="center"> ${msg}</div>

<br/>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th colspan="2">Employee Action</th>
    </tr>
    <c:forEach var="tab" items="${data}">
        <form action="update" method="post">
            <tr>
                <td><input type="text" name="employeeId" value="${tab.employeeId}" readonly="readonly"></td>
                <td><input type="text" name="employeeName" value="${tab.employeeName}"></td>
                <td><input type="text" name="email" value="${tab.email}"></td>
                <td><input type="text" name="address" value="${tab.address}"></td>
                <td>
                    <input type="submit" value="Update" class="button">
        </form>

        </td>
        <td colspan="2">
            <form action="delete">
                <input type="hidden" name="employeeId" value="${tab.employeeId}">
                <input type="submit" value="Delete" class="buttonDelete">
            </form>
        </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="6"><strong>Total Records : ${countRow}</strong></td>
    </tr>
</table>
<br/>
<div align="center"><a href="/">Home Page</a></div>
</body>
</html>