<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<center>
		<form action="signin" modelAttribute="userBean">
				<table>
					<tr>
						<td>username</td><td><input type="text" name="username"/></td>
					</tr>
					<tr>
						<td>password</td><td><input type="text" name="password"/></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit" value="login"/></td>
					</tr>
				</table>
		</form>
		<br>
		${userBean.username} <br>
		${userBean.password}
	</center>
</body>
</html>