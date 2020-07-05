package org.mindgame.sf_core_using_factory_bean_and_normal_bean_class;

import java.util.Date;

public class TestBean {

	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	//implementing the methods FactoryBean Interface
	public Object getObject() throws Exception{
		System.out.println("getObject().....");
		if (msg==null) {
			return new String("sathya coaching");
		}
		else
			return new Date();
	}
	
	public Class getObjectType(){
		System.out.println("getObject().....");
		if (msg==null) {
			return String.class;
		}
		else
			return Date.class;
	}
	
}
