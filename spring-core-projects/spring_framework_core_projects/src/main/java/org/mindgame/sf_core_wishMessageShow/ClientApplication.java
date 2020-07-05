package org.mindgame.sf_core_wishMessageShow;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Locating Spring configuration file and activate spring container.
		//by default spring container looks spring configuration file into src/main/resources folder of spring project.
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_wishMessageShow.xml");
		
		//	another way to activate spring container	
		//GenericApplicationContext container = new GenericApplicationContext();
		//new XmlBeanDefinitionReader(container).loadBeanDefinitions("spring_cfg_wishMessageShow.xml");
		//container.refresh();
		
		//by exposing the client to get spring bean class object from spring container
		//DemoBean obj = container.getBean("db",DemoBean.class);
		
		//by without exposing the client to get spring bean class object from spring container
		Object obj = container.getBean("db");
		
		// get reference of spring beans
		Demo demo = (Demo)obj;
	
		//call business methods
		System.out.println(demo.generateWishMessage("Adarsh Chauhan"));
	}

}
