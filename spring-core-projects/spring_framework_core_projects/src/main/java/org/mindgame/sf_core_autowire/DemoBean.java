package org.mindgame.sf_core_autowire;

public class DemoBean implements Demo {

	private TestBean tb;
	
	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return "T "+tb;
	}

}
