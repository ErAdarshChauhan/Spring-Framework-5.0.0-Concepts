package com.chauhansoft.controller;

import java.util.List;
import java.util.Optional;

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
	
	@RequestMapping("/display")
	public String listAllEmployee(Model model) {
		List list = (List) dao.findAll();
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
			model.addAttribute("countRecords", dao.count());
			return "display";
		} else {
			model.addAttribute("msg", "<h4 style='color:red;'>There is no Employee</h4>");
			model.addAttribute("countRecords", dao.count());
			return "display";
		}
	}
	
	@RequestMapping("/edit")
	public String findByEmployeeId(Employee employee, Model model) {
		Optional<Employee> list = dao.findById(employee.getEmployeeId());
		if (list.empty() != null) {
			dao.save(employee);
			model.addAttribute("data", dao.findAll());
			model.addAttribute("countRecords", dao.count());
			model.addAttribute("msg", "<h4 style='color:green;'>Employee updated successfully....</h4>");
			return "display";
		} else {
			model.addAttribute("msg", "<h4 style='color:red;'>There is no Employee</h4>");
			model.addAttribute("countRecords", dao.count());
			return "display";
		}
	}
	  
	@RequestMapping("/delete")   
	public String deleteEmployee(Employee employee,Model model) {
		
		dao.findById(employee.getEmployeeId());
		dao.deleteById(employee.getEmployeeId());
		model.addAttribute("data", dao.findAll());
		model.addAttribute("countRecords", dao.count());
		model.addAttribute("msg", "<h4 style='color:red;'>Employee deleted successfully....</h4>");
		return "display";
	}
	
	@RequestMapping("/deleteAllEmployee")
	public String deleteAllEmployee(Model model) {
		dao.deleteAll();
		model.addAttribute("msg", "<h4 style='color:green;'>All Employees have deleted successfully.....</h4>");  
		return "index";
	}
}
