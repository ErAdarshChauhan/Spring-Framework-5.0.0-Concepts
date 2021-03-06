<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isErrorPage="false" isELIgnored="false"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Display</title>
    <script src="jquery-3.4.1.js"></script>
    <script type="text/javascript">
        /* $(document).ready(function() {
            alert("${msg}");
	}); */
    </script>
    <style type="text/css">
        table {
            margin: auto;
            width: 100%;
        }

        table, td, tr {
            border: 1px solid black;
            border-collapse: collapse;
        }

        th {
            background-color: black;
            color: white;
        }
    </style>
</head>
<body>
<div align="center">
    <h1>Employee Operations</h1>
    <hr/>
</div>
<div align="center">

    <h5>${msg}</h5>
</div>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Designation</th>
        <th>Action</th>
    </tr>
    <c:forEach var="tab" items="${data}">
        <form action="edit" method="post">
            <tr align="center">
                <td><input type="text" name="employeeId" value="${tab.employeeId}" readonly></td>
                <td><input type="text" name="employeeName" value="${tab.employeeName}"></td>
                <td><input type="text" name="email" value="${tab.email}"></td>
                <td><input type="text" name="designation" value="${tab.designation}"></td>
                <td>
                    <input type="submit" value="Update">
        </form>
        <form action="delete" method="post">
            <input type="hidden" name="employeeId" value="${tab.employeeId}">
            <input type="submit" value="Delete">
        </form>
        </td>
        </tr>

    </c:forEach>
    <tr>
        <td colspan="6" align="center"><h4>Total Records : ${countRecords}</h4></td>
    </tr>
</table>

</body>
</html>