package org.chauhansoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterWithAnnotationControler {

	@RequestMapping("/register2")
	public String showRegisterPage() {
		return "registration2";
	}
	
	//reading request parameter through annotations
		@RequestMapping("/signin2")
		public String showRegistrationDetails_2(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {
			//saving all details to model object.
			model.addAttribute("user", username);
			model.addAttribute("pass", password);
			
			return "registration2";
		}
}
