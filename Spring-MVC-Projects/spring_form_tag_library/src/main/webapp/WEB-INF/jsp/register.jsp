<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration:Form</title>
</head>
<body>
		<center><h4>This is Registeration Form</h4></center>
		
		<form:form action="student" method="POST" modelAttribute="studentBean">
			Name : <form:input path="name"/><br>
			Age: <form:input path="age"/><br>
			Email: <form:input path="email"/><br>
			Gender: <br>
			<form:radiobutton path="gender" value="Male"/>Male
			<form:radiobutton path="gender" value="Female"/>Female <br>
			
			Courses: <br>
			<form:checkbox path="courses" value="B.Tech"/>B.Tech <br>
			<form:checkbox path="courses" value="M.Tech"/>M.Tech <br>
			<form:checkbox path="courses" value="BCA"/>BCA <br>
			<form:checkbox path="courses" value="MCA"/>MCA <br>
			
			Category:
			<form:select path="category">
				<form:option value="General">General</form:option>
				<form:option value="OBC">OBC</form:option>
				<form:option value="SC/ST">SC/ST</form:option>
				<form:option value="Other">Other</form:option>
			</form:select>
			<form:button>Register</form:button>
		</form:form>
		
		${studentBean.name} <br>
		${studentBean.age} <br>
		${studentBean.email} <br>
		${studentBean.gender} <br>
		${studentBean.courses} <br>
		${studentBean.category} <br>
		
		${name}
</body>
</html>