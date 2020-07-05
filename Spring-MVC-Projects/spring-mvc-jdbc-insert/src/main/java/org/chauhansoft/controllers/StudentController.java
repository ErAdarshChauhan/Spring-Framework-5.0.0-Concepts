package org.chauhansoft.controllers;

import org.chauhansoft.dao.StudentDao;
import org.chauhansoft.model.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	private AbstractApplicationContext container;
	@RequestMapping("/register")
	public String loadRegister(Model model) {
		container = new ClassPathXmlApplicationContext("../resources/SpringBean.xml");
		Student student = container.getBean("student", Student.class);
		System.out.println("student : "+student);
		model.addAttribute("studentBean", student);
		return "register";
	}
	
	@RequestMapping("/studentRegister")
	public String getStudentData(@ModelAttribute("studentBean")Student student, Model model) {
		System.out.println("/studentRegister");
		container = new ClassPathXmlApplicationContext("../resources/SpringBean.xml");
		StudentDao studentDao = container.getBean("studentDao", StudentDao.class);
		System.out.println("studentDao : "+studentDao);
		studentDao.insertStudent(student);
		model.addAttribute("msg", "Records insert successfully");
		return "register";
	}
	
}
