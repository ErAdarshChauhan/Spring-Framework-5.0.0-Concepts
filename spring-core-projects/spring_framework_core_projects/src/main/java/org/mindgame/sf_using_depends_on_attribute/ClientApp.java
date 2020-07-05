package org.mindgame.sf_using_depends_on_attribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//locate spring configuration file and activate spring container
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfgusing_depends_on_attribute.xml");
		
		//getting spring bean class object from spring container
	//	Object obj = container.getBean("db");
	
		//getting spring bean class reference into it's implemented interface reference variable.
		
	//	Demo demo = (Demo)obj;
		
		//calling business methods
	//	System.out.println(demo.sayHello());
	}

}
