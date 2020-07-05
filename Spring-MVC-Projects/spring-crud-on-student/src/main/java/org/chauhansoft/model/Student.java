package org.chauhansoft.model;

import org.hibernate.validator.constraints.NotBlank;

public class Student {

	private String studentId;
	@NotBlank(message = "** Employee Name Required.")
	private String studentName;
	private String email;
	private String course;
	private String category;
	private Boolean flag;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", course="
//				+ course + ", category=" + category + "]";
//	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public Boolean getFlag() {
		return flag;
	}
	
	
}
