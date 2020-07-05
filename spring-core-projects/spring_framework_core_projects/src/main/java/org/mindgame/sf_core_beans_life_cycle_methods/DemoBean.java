package org.mindgame.sf_core_beans_life_cycle_methods;

import java.util.Date;

public class DemoBean implements Demo{

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
	//custom life cycle methods to verify either conatiner injected dependent values or not.
	public void myInit()throws Exception{
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

	//custom life cycle methods to nullyfiy the properties.
	public void myDestroy()throws Exception{
		name = null;
		age = 0;
		d = null;
	}
	public String showData() {
		// TODO Auto-generated method stub
		return name+" \n"+age+" \n"+d;
	}

}
