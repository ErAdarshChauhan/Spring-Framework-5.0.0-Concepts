<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Register</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style type="text/css">
        .set-form {
            margin: auto;
            width: 100%;
            margin-top: 100px;

        }

        .set-container {
            margin-left: 10px;
            margin-right: 10px;
        }

        .btn-width {
            width: 20%;
        }

        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;

        }

        table {
            width: 100%;
        }

        td, th {
            text-align: center;
        }
    </style>
</head>
<body>

<div class="text-center"><h4><strong>Register New Employee</strong></h4>
    <hr/>
</div>
<div class="text-center"><h5>${msg}</h5></div>
<div class="container set-form bg-success">

    <table>
        <tr>
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th>E-mail</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        <c:forEach var="tab" items="${data}">
            <form action="updateEmployee" method="post">
                <tr>
                    <td><input type="text" value="${tab.employeeId}" name="employeeId" readonly="readonly"></td>
                    <td><input type="text" value="${tab.employeeName}" name="employeeName"></td>
                    <td><input type="text" value="${tab.email}" name="email"></td>
                    <td><input type="text" value="${tab.address}" name="address"></td>
                    <td>
                        <input type="submit" value="Update" class="btn btn-primary">
            </form>
            <form action="deleteEmployee" method="post">
                <input type="hidden" value="${tab.employeeId}" name="employeeId">
                <input type="submit" value="Delete" class="btn btn-danger">
            </form>
            </td>
            </tr>
        </c:forEach>

    </table>

</div>
<br>
</div>
<div class="text-center"><a href="/">Home Page</a></div>
</div>
</body>
</html>