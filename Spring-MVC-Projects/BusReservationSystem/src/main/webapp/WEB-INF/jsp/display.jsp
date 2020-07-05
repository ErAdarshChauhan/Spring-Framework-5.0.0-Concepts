<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
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
			.bus{
				font-size:x-large;
				color:maroon;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<div class="heading">
			<h2>Bus Reservation Details</h2>
		</div>
		<br>
		 
		<div>
			<span class="bus">Bus Details</span>
			   <h5>Hey! <span style="color: green;">Mr. ${busModel.passengerName}</span> your bus ticket is booked in Bus 
			  Number : ${busModel.busNumber} whose owner is <span style="color: green;">Mr. ${busModel.busOwnerName} </span>with your id 
			  : ${busModel.passengerId}.
			  
			   You are going from <span style="color: green;">${busModel.fromAddress} </span> to
			  <span style="color: green;">${busModel.toAddress} </span> on Date : <span style="color: green;">${busModel.dateOfJourney}</span> 
			  with Ticket Amount of <span style="color: green;">${busModel.ticketAmount}</span>.
			  </h5>  
			  <br>
			 <span class="bus">Passenser Details</span> 
			  <h5>We will contact to You with Your Personal details in case if you have tackle any problems.</h5>
			 
			  <h5>Your Name : Mr. ${busModel.passengerName}</h5>
			  <h5>Your Id :  ${busModel.passengerId}</h5>
			  <h5>Gender :  ${busModel.gender}</h5>
			  <h5>Your Permanent Address :  ${busModel.passengerPermanentAddress}</h5> 
		</div>
		
		
	</body>
</html>
