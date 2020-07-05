package org.chauhansoft.model;

import java.util.Date;
import org.hibernate.validator.constraints.NotBlank;

public class BusModel {
	
	@NotBlank(message =  "** Bus No. Required.")
	private String busNumber;
	private String busOwnerName;
	
	private String passengerId;
	private String passengerName;
	private String gender;
	private String passengerPermanentAddress;
	private String fromAddress;
	private String toAddress;
	private Date dateOfJourney;
	
	private String ticketAmount;

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusOwnerName() {
		return busOwnerName;
	}

	public void setBusOwnerName(String busOwnerName) {
		this.busOwnerName = busOwnerName;
	}

	public String getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassengerPermanentAddress() {
		return passengerPermanentAddress;
	}

	public void setPassengerPermanentAddress(String passengerPermanentAddress) {
		this.passengerPermanentAddress = passengerPermanentAddress;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
//

	public Date getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public String getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(String ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
//	
	
}
