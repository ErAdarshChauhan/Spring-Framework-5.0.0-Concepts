package org.mindgame.sf_core_BeanPostProcessor_interface_using_multiple_beans;

public class DemoBean implements Demo {

	String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("setMsg()..........(1)........");
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return "Good Morning : "+msg;
	}

}
