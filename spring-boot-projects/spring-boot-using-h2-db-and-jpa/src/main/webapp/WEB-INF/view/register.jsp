<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         isELIgnored="false" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Register</title>
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
<form action="registerEmployee" method="post">
    <table>

        <tr>
            <td>Name:</td>
            <td><input type="text" name="employeeName"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email"></td>
        </tr>
        <tr>
            <td>Designation:</td>
            <td><input type="text" name="designation"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit"
                                                  value="Register"></td>
        </tr>
    </table>

</form>
<h5 align="center">${msg}</h5>
</body>
</html>