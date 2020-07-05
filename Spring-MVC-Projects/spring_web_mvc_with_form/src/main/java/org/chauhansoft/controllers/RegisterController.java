package org.chauhansoft.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

	@RequestMapping("/register")
	public String showRegisterPage() {
		return "registeration";
	}
	
	//reading request parameter through HttpServletRequest
	@RequestMapping("/signin")
	public String showRegistrationDetails(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//saving all details to model object.
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "registeration";
	}
	
	
}
