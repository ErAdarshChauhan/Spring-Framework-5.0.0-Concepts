package org.mindgame.sf_core_autowire;

public class TestBean {

	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return "TestBean : "+msg;
	}
}
