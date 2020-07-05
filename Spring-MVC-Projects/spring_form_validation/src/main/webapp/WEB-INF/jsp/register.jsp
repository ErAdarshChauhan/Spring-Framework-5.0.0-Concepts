<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>| Register Form |</title>
<style type="text/css">
	.errors{
		color: red;
	}
</style>
</head>
<body>
		<center><h4>Welcome to Employee Provident Fund</h4>
		<form:form action="employee" method="post" modelAttribute="employeeBean">
			<table>
				<tr>
					<td>Employee Code : </td>
					<td>
						<form:input path="employeeCode"/>
						<span>
							<form:errors path="employeeCode" cssClass="errors"/>
						</span>
					</td>
				</tr>
				<tr>
					<td>Employee Name : </td>
					<td>
						<form:input path="employeeName"/><br>
						<span>
							<form:errors path="employeeName" cssClass="errors"/>
						</span>
					</td>
				</tr>
				<tr>
					<td>Employee Email : </td>
					<td>
						<form:input path="email"/><br>
						<span>
							<form:errors path="email" cssClass="errors"/>
						</span>
					</td>
				</tr>
				<tr><td>Employee Designation : </td><td><form:input path="designation"/></td></tr>
				<tr><td colspan="2" align="center">Address</td></tr>
				<tr><td>Plot No : </td><td><form:input path="door"/></td></tr>
				<tr><td>Street : </td><td><form:input path="street"/></td></tr>
				<tr><td>Landmark : </td><td><form:input path="landmark"/></td></tr>
				<tr><td>Area : </td><td><form:input path="area"/></td></tr>
				<tr>
					<td>Pin Code : </td>
					<td>
						<form:input path="pincode"/><br>
						<span>
							<form:errors path="pincode" cssClass="errors"/>
						</span>
					</td>
				</tr>
				<tr><td>District : </td><td><form:input path="district"/></td></tr>
				<tr><td>State : </td><td><form:input path="state"/></td></tr>
				<tr><td>Country : </td><td><form:input path="country"/></td></tr>
				<tr><td colspan="2" align="center"><form:button>Register</form:button></td></tr>
			</table>
		</form:form>
		</center>
</body>
</html>