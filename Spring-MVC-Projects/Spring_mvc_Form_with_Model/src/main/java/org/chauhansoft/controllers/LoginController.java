package org.chauhansoft.controllers;

import org.chauhansoft.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showLoginPage(Model model) {
		
		model.addAttribute("userBean",new User());
		return "login";
	}
	
	@RequestMapping("/signin")
	public String showLoginDetails(@ModelAttribute("userBean")User user) {
		return "login";
	}
}
