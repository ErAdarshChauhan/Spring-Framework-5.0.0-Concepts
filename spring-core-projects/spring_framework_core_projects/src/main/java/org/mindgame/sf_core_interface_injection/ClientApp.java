package org.mindgame.sf_core_interface_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//locate spring configuration file and activate spring container
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_interface_injection.xml");
		
		//get spring bean class object from spring container
		Object obj = container.getBean("db");
		
		Demo demo = (Demo)obj;
		
		//call business method
		System.out.println(demo.sayHello());
	}

}
