package org.mindgame.sf_core_scopes_in_spring;
import java.util.Calendar;
public class DemoBean implements Demo {

	//spring bean property
	private String msg;
	
	public DemoBean() {
		// TODO Auto-generated constructor stub
		System.out.println("0-param constructor");
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("setMsg(String msg)...........");
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return msg;
	}
}
