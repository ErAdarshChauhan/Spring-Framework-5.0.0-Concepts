<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         isELIgnored="false" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home</title>
    <script src="jquery-3.4.1.js"></script>
    <script type="text/javascript">
        /* $(document).ready(function() {
            alert("Hi");
        }); */
    </script>
    <style type="text/css">
        table {
            margin: auto;
            width: 600px;
        }

        table, td, tr {
            border: 0px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<div align="center">
    <h1>Employee Operations</h1>
    <hr/>
</div>

<div align="center">
    <a href="register">Register Employee</a>&nbsp;&nbsp;|
    <a href="display">Display/Update/Delete Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;|
    <a href="deleteAllEmployee">Delete All Employee</a>
</div>
<div align="center">
    ${msg}
</div>
</body>
</html>