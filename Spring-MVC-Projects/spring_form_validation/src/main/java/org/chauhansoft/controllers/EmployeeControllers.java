package org.chauhansoft.controllers;

import javax.validation.Valid;

import org.chauhansoft.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControllers {

	@RequestMapping("/register")
	public String  showRegisterPage(Model model) {
		
		model.addAttribute("employeeBean", new Employee());
		return "register";
	}
	
	@RequestMapping("/employee")
	public String showEmployeeDetails(@Valid @ModelAttribute("employeeBean")Employee emp, BindingResult br) {
		if (br.hasErrors()) {
			return "register";
		} else {
			return "display";
		}
		
	}
}
