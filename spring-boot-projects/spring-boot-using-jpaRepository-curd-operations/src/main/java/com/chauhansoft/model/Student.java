package com.chauhansoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Entity
@Table(name = "Student_Info")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "SID",length = 5)
    private Long studentId;
    //	@Column(name = "SNAME",length = 50)
    private String studentName;
    //	@Column(name = "EMAIL",length = 40)
    private String email;
    //	@Column(name = "COURSE")
    private String course;

    //	public Long getStudentId() {
//		return studentId;
//	}
//	public void setStudentId(Long studentId) {
//		this.studentId = studentId;
//	}
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


}
