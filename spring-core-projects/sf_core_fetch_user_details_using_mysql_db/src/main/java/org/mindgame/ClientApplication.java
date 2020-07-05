package org.mindgame;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Locating Spring configuration file and activate spring container.
		//by default spring container looks spring configuration file into src/main/resources folder of spring project.
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_mysql_db.xml");
		
		//	another way to activate spring container	
		//GenericApplicationContext container = new GenericApplicationContext();
		//new XmlBeanDefinitionReader(container).loadBeanDefinitions("spring_cfg_wishMessageShow.xml");
		//container.refresh();
		
		//by without exposing the client to get spring bean class object from spring container
		Object obj = container.getBean("sb");
		
		// get reference of spring beans
		Select demo = (Select)obj;
	
		//call business methods
		System.out.println(demo.fetchUsername(101));
		System.out.println(demo.fetchCity(101));
		System.out.println("------------ Full Record ---------");
		System.out.println(demo.fetchUser(101));
		System.out.println(demo.fetchUser(101));
	}

}
