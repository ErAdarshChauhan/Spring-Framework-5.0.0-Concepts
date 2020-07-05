package org.mindgame.sf_core_using_factory_bean_and_normal_bean_class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//locate spring configuration file and activate spring container
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_using_factory_bean_and_normal_bean_class.xml");
		
		//get spring bean class object from spring conatiner
		Object obj = container.getBean("db");
		Demo demo = (Demo)obj;
		
		//call business method
		System.out.println(demo.sayHello());
	}
}
