package org.mindgame.sf_using_depends_on_attribute;

import java.util.Date;

public class DemoBean implements Demo{
	private String msg;
	private Date d;
	
	public DemoBean() {
		System.out.println("DemoBean() called ........");
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void setD(Date d) {
		this.d = d;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return msg+" and "+d;
	}
	
}
