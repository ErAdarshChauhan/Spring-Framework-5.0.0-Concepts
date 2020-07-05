package com.chauhansoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chauhansoft.dao.EmployeeDao;
import com.chauhansoft.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String loadRegisterPage() {
		return "register";
	}
	
	@RequestMapping("/registerEmployee")
	public String registrationPage(Employee employee, Model model) {
		dao.save(employee);
		model.addAttribute("msg","Records inserted successfully.......");
		return "register";
	}
	
	@RequestMapping("display")
	public String listAllEmployee(Model model) {
		List list = (List) dao.findAll();
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
			return "display";
		} else {
			model.addAttribute("msg", "<h4 style='color:red;'>There is no Employee</h4>");
			return "display";
		}
		
	}
}
