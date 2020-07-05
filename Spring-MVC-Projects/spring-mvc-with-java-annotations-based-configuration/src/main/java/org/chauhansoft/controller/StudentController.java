package org.chauhansoft.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chauhansoft.model.Student;
import org.chauhansoft.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@Autowired
	private Student student;
	
	@Autowired
	private StudentService studentService ;
	
	
	//create countries list using map.
	@ModelAttribute("countriesList")
	public Map<String,String> countries() {
			
			Map<String,String> map = new HashMap<String,String>();
			map.put("India", "India");
			map.put("USA", "USA");
			map.put("Sri Lanka", "Sri Lanka");
			map.put("Russia", "Russia");
			return map;
	}
	
	@RequestMapping("/studentPortal")
	public String loadHomePage() {
		return "home";
	}
	
	@RequestMapping("/register")
	public String loadRegisterPage(Model model) {
		model.addAttribute("studentBean", student);
		return "register";
	}

	@RequestMapping("/studentInsert")
	public String registerStudent(@ModelAttribute("studentBean") Student student, Model model) {
		boolean flag = studentService.insertStudent(student);
		System.out.println(student.getCountry());
		System.out.println(flag);
		if (!flag) {
			model.addAttribute("msg", "Student records inserted successfully.....");
			return "register";
		} else {
			model.addAttribute("msg", "Student records not inserted.");
			return "register";
		}
	}
	
	@RequestMapping("/display")
	public String displayStudent(Model model) {
		List<Student> list = studentService.getAllStudent();
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
			return "display";
		} else {
			model.addAttribute("msg","Ooops ! there is no Student." );
			return "display";
		}
	}
	
	
}
