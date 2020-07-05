<%@page import="org.eclipse.jdt.internal.compiler.ast.IfStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration Page-2</title>
</head>
<body>
		<center><h2><span style="background-color: black;color: white;">Welcome to registeration Page</span></h2></center>
			<center>
				<form action="signin2" method="post">
					<table>
					  <tr>
					    <td>Username</td><td><input type="text" name="username"></td>
					  </tr>
					  <tr>
					    <td>Password</td><td><input type="password" name="password"></td>
					  </tr>
					  <tr>
					    <td colspan="2"><center><input type="submit" value="Register"></center></td>
					  </tr>
					</table>
		
				</form>
				
				<br>
				
				 ${user} <br> ${pass}
			
			</center>
			
			
			
</body>
</html>