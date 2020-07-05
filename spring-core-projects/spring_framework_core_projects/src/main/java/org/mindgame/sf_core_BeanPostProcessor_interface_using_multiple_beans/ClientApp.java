package org.mindgame.sf_core_BeanPostProcessor_interface_using_multiple_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Locate Spring configuration file and activate spring container
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_BeanPostProcessor_interface_using_multiple_beans.xml");
		
		//get spring bean class object from spring container
		
		Object obj = container.getBean("db");
		Object obj1 = container.getBean("db1");
		Demo demo = (Demo)obj;
		Demo demo1 = (Demo)obj1;
		//call business method
		System.out.println(demo.sayHello());
		System.out.println(demo1.sayHello());
	}

}

