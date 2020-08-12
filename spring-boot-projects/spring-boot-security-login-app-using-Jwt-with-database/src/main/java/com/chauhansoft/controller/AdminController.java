package com.chauhansoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chauhansoft.entity.User;
import com.chauhansoft.repository.UserRepository;

@RestController
@RequestMapping("/api/rest")
public class AdminController {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		String encryptPassword = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(encryptPassword);
		repository.save(user);
		return user.getUsername()+" Added by Admin successfully.";
	}
}
