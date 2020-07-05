<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>| Bus Reservation Form |</title>
		<style type="text/css">
			.heading{
				background-color: black;
				color: white;
				text-align: center;
			}
			.errors{
				color: red;
			}
		</style>
	</head>
	<body>
		<div class="heading">
			<h2>Bus Reservation Form</h2>
		</div>
		<br>
		<div>
			<form:form action="ticket" modelAttribute="busModel" method="post">
				 <table>
				 	<tr>
				 		<td>Bus No : </td>
				 		<td>
				 			<form:input path="busNumber"/>
				 			<span>
									<form:errors path="busNumber" cssClass="errors"/>
							</span>
				 		</td>

				 	</tr>
				 	<tr>
				 		<td>Bus Owner Name : </td>
				 		<td><form:input path="busOwnerName"/></td>
				 	</tr>
				 	<tr>
				 		<td>Passenger Id : </td>
				 		<td><form:input path="passengerId"/></td>
				 	</tr>
				 	<tr>
				 		<td>Passenger Name : </td>
				 		<td><form:input path="passengerName"/></td>
				 	</tr>
				 	<tr>
				 		<td>Gender : </td>
				 		<td>
				 			<form:radiobutton path="gender" value="Male"/>Male
				 			<form:radiobutton path="gender" value="Female"/>Female
				 		</td>
				 	</tr>
				 	<tr>
				 		<td>Passenger Address : </td>
				 		<td><form:input path="passengerPermanentAddress"/></td>
				 	</tr>
				  	<tr>
				 		<td>Ticket From : </td>
				 		<td>
				 			<form:select path="fromAddress">
					 			<form:option value="New Delhi">New Delhi</form:option>
					 			<form:option value="Gorakhpur">Gorakhpur</form:option>
					 			<form:option value="Kanpur">Kanpur</form:option>
					 			<form:option value="Lucknow">Lucknow</form:option>
					 			<form:option value="Faridabad">Faridabad</form:option>
					 		</form:select>
				 		</td>
				 	</tr>
				 	<tr>
				 		<td>Ticket To : </td>
				 		<td>
				 			<form:select path="toAddress">
					 			<form:option value="New Delhi">New Delhi</form:option>
					 			<form:option value="Gorakhpur">Gorakhpur</form:option>
					 			<form:option value="Kanpur">Kanpur</form:option>
					 			<form:option value="Lucknow">Lucknow</form:option>
					 			<form:option value="Faridabad">Faridabad</form:option>
					 		</form:select>
				 		</td>
				 	</tr>  
				 	<tr>
				 		<td>Date of Journey (dd/mm/yyyy): </td>
				 		<td><form:input type="date" path="dateOfJourney"/></td>
				 	</tr>
				 	<tr>
				 		<td>Ticket Amount : </td>
				 		<td><form:input path="ticketAmount"/></td>
				 	</tr>
				 	<tr>
				 		<td colspan="2" align="center">
				 			<input type="submit"  value="Book Ticket"/>
				 		</td>
				 	</tr>
				 </table>
			</form:form>
		</div>
		
		
	</body>
</html>
