package org.mindgame.sf_core_using_factory_bean_and_normal_bean_class;

public class DemoBean implements Demo{

	Object tb;

	public void setTb(Object tb) {
		this.tb = tb;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return "Good Morning : "+" tb : "+tb;
	}
	
}
