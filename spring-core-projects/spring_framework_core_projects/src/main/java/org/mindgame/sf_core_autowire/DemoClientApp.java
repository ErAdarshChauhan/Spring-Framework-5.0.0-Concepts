package org.mindgame.sf_core_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//locate spring configuration file and activate spring container
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_autowire.xml");
		
		//get spring bean class from spring container
		Object obj = container.getBean("db");
		System.out.println(obj.getClass()+" "+obj.hashCode());
		
		Demo demo = (Demo)obj;
		
		//call business method
		System.out.println("DemoBean : "+demo.sayHello());
	}

}
