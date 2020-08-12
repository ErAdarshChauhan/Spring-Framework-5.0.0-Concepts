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
            width: 600px;
            margin-top: 100px;
            border-radius: 15px;
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

        th {
            background-color: black;
            color: white;
        }
    </style>
</head>
<body>
<div class="container set-form bg-success">
    <div class="row">
        <div class="col-3-sm">
            <div class="set-container">
                <div class="text-center"><h5>${msg}</h5></div>
                <div class="text-center"><h4><strong>Register New Employee</strong></h4>
                    <hr/>
                </div>
                <form action="searchEmployee" method="post">
                    <div class="form-group">
                        Employee Id
                        <input type="number" name="employeeId" class="form-control"/>
                    </div>
                    <div class="form-group">
                        Employee Name
                        <input type="text" name="employeeName" class="form-control"/>
                    </div>
                    <div class="form-group">
                        E-mail
                        <input type="text" name="email" class="form-control"/>
                    </div>
                    <div class="form-group">
                        Address
                        <input type="text" name="address" class="form-control"/>
                    </div>
                    <div class="form-group text-center">
                        <input type="submit" value="search" class="btn btn-primary btn-width form-control"/>
                    </div>
                </form>
            </div>
        </div>
        <div class="text-center"><a href="/">Home Page</a></div>
    </div>
</div>

<div class="container set-form bg-success">
    <div class="row">
        <div class="col-3-sm">
            <form action="searchEmployee">
                <table>
                    <tr>
                        <th>Employee Id</th>
                        <th>Employee Name</th>
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

            </form>
        </div>
    </div>
</div>
</body>
</html>