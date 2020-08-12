<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home Page</title>
    <style type="text/css">
        table {
            width: 900px;
            margin: auto;
        }

        table, th, td {
            border-collapse: collapse;
            border: 1px solid black;
            text-align: center;
        }

        th {
            background-color: black;
            color: white;
        }
    </style>
</head>
<body>
<div align="center"><h2>Register Employee</h2></div>
<hr/>
<div align="center">
    <form action="searchEmployee" method="post">
        Employee Id : <input name="employeeId">
        Name : <input name="employeeName">
        E-mail : <input name="email">
        Address : <input name="address">
        <input type="submit" value="search"><br/>
    </form>
    <br/>
    <hr/>
    <br/>

    <div align="center">
        <table>
            <tr>
                <th>Id</th>
                <th>EmpId</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th colspan="2">Employee Action</th>
            </tr>
            <c:forEach var="tab" items="${data}">
                <form action="update" method="post">
                    <tr>
                        <td><input type="text" name="id" value="${tab.id}" readonly="readonly"></td>
                        <td><input type="text" name="employeeId" value="${tab.employeeId}" readonly="readonly"></td>
                        <td><input type="text" name="employeeName" value="${tab.employeeName}"></td>
                        <td><input type="text" name="email" value="${tab.email}"></td>
                        <td><input type="text" name="address" value="${tab.address}"></td>
                        <td><input type="submit" value="Update" name="update">
                </form>
                </td>
                <td colspan="2">
                    <form action="delete" method="post">
                        <input type="hidden" name="employeeId" value="${tab.employeeId}">
                        <input type="submit" value="Delete" name="delete">
                    </form>
                </td>
                </tr>
            </c:forEach>

        </table>
        <h5>${msg }</h5>
    </div>
    <a href="/">Goto Home</a>
</div>
</body>
</html>