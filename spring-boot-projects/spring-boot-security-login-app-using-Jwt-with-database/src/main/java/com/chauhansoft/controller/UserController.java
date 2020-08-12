package com.chauhansoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chauhansoft.entity.User;
import com.chauhansoft.repository.UserRepository;

@RestController
@RequestMapping("/api/rest")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public List<User> getAllUsers() {
		return  userRepository.findAll();
	}
}
