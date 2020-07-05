package org.mindgame.sf_core_static_factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//locate spring configuration file and Activate spring container
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_static_factory_method.xml");
		
		//get Spring bean class object from spring container
		
		//get instance-factory methods beans id
		Object obj = container.getBean("db");
		Object obj1 = container.getBean("s3");
		
		//get static-factory methods beans id
		Object obj3 = container.getBean("cl");
		Object obj4 = container.getBean("c");
		
		Demo demo = (Demo)obj;
		
		//call business method
		System.out.println("Message : "+demo.sayHello());
		System.out.println(obj1);
		System.out.println(obj3);
		System.out.println(obj4);
	}

}
