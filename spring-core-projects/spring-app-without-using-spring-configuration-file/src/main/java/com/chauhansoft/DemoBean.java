package com.chauhansoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoBean implements Demo{

	@Value("Adarsh Chauhan")
	private String msg;
	
	@Autowired
	@Qualifier("softwareEngineer")
	Engineer engineer;
	
	
	public String sayHello() {
		// TODO Auto-generated method stub
		return msg;
	}

}
