package com.chauhansoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//locate Spring configuration class file and activate spring container by loading spring configuration class file.
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfigurationClassFile.class);
		
		//getting  spring class object from spring container
		Object obj  = container.getBean("demoBean");
//		
		DemoBean demo = (DemoBean)obj;
		demo.engineer.development();
		demo.engineer2.development();
		
		System.out.println(demo.sayHello());
	}

}
