package org.mindgame.sf_core_inject_object_by_setter_injection;

public class TestBean {
	private String msg;

	public TestBean() {
	   System.out.println("0-param TestBean constructor");
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return "TestBean : "+msg;
	}

}
