package org.mindgame.sf_core_inject_object_by_setter_injection;
import java.util.Date;
public class DemoBean implements Demo {

	//spring bean property
	private String name;
	private int age;
	private Date d;
	private TestBean t;
	
	public DemoBean() {
		System.out.println("0-param DemoBean constructor...");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public void setT(TestBean t) {
		this.t = t;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return "Name : "+name
				+" \n Age : "+age
				+" \n Date : "+d
				+" \n TestBean : "+t;
	}	
}
