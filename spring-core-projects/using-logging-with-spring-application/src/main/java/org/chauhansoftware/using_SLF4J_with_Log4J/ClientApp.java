package org.chauhansoftware.using_SLF4J_with_Log4J;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientApp {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientApp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Locate spring configuration file and activate spring container
		logger.info("spring container Activated : ");
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_using_SLF4J.xml");
		
		//getting spring bean class object from spring container
		Object obj  = container.getBean("db");
		
		Demo demo = (Demo)obj;
		
		// call business method
		System.out.println(demo.sayHello());
		
	}

}
