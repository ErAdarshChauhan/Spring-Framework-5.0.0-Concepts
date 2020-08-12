package com.chauhansoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chauhansoft.model.User;

@RestController
@RequestMapping("/api/rest")
public class UserController {  

		
	@GetMapping("/user/msg")
	public String showName() {  
		
		return "Hey There!.... I am User";
	}
}
