package org.mindgame.sf_core_static_factory_method;

public class DemoBean implements Demo {

	private String msg;
	
	public DemoBean(String msg) {
		this.msg = msg;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return msg;
	}

}
