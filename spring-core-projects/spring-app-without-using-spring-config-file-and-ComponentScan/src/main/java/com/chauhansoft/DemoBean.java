package com.chauhansoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoBean implements Demo{
	
	
	@Value("${bean.msg}")
	private String msg;
	
	
	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Autowired
	SoftwareEngineer engineer;
	
	@Autowired
	HardwareEngineer engineer2;

	public void setEngineer(SoftwareEngineer engineer) {
		this.engineer = engineer;
	}


	public String sayHello() {
		// TODO Auto-generated method stub
		return msg = "Hey ! "+msg;
	}

}
