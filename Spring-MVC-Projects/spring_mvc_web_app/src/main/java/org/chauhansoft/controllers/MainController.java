package org.chauhansoft.controllers;

import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
		
	@RequestMapping("/welcome")
	@ResponseBody
	public String showWelcome() {
		return "Hey welcome Mr. Adarsh Chauhan.";
	}
	
	@RequestMapping("/welcomePage")
	public String showWelcomePage() {
		return "welcome";
	}
}
