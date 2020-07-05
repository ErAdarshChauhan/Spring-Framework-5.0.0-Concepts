package org.chauhansoft.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Employee {

//	@NotBlank(message = "** Employee Code Required.")
	
	private int employeeCode;
	@NotBlank(message = "** Employee Name Required.")
	@Size(min = 3,message = "** Min 3 Characters Required.")
	private String employeeName;
	@javax.validation.constraints.Email(message ="** Valid Employee Email Required." )
	@NotBlank(message =  "** Employee Email Required.")
	private String email;
	private String designation;
	private int door;
	private String street;
	private String landmark;
	private String area;
	@NotBlank(message =  "** Employee Pincode Required.")
	@Pattern(regexp="^[0-9]*", message = "** Only Digits Required.")
	@Size(min = 6,max = 6,message = "** Min 6 Digits Required.")
	private String pincode;
	private String district;
	private String state;
	private String country;
	
	public int getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
