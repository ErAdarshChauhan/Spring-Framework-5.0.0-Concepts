package org.chauhansoft.controllers;

import org.chauhansoft.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

	@RequestMapping("/register")
	public String loadRegisterPage(Model model) {
		
		//instead of creating Empty Student object with new keyword, we can create Empty Student object using bean tag by specifying the 
		//spring configuration file here for this we use ApplicationContext to activate container and obtain bean object.
		model.addAttribute("studentBean", new Student());
		return "register";
	}
	
	@RequestMapping("/student")
	public String showStudentDetails(@ModelAttribute("studentBean")Student stud, Model model) {
		//we can modify the output with label_name using Model
		model.addAttribute("name", "Name : "+stud.getName());
		return "register";
	}
}
