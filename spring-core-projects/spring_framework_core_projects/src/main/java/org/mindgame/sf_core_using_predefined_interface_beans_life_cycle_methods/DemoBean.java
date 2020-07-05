package org.mindgame.sf_core_using_predefined_interface_beans_life_cycle_methods;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DemoBean implements Demo,InitializingBean,DisposableBean{

	private String name;
	private int age;
	private Date d;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setD(Date d) {
		this.d = d;
	}
		
	//custom life cycle methods to nullyfiy the properties.
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		name = null;
		age = 0;
		d = null;
	}
	
	//custom life cycle methods to verify either conatiner injected dependent values or not.
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		if(name == null || name == "") {
			throw new Exception("Name Required.");
		}
		if(age <=0 || age >= 100) {
			throw new Exception("Valid Age Required.");
		}
		if(d == null) {
			throw new Exception("Date Required.");
		}
	}
	
	public String showData() {
		// TODO Auto-generated method stub
		return name+" \n"+age+" \n"+d;
	}
}
