package org.mindgame;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication implements Filter{

	//get logger object
	private static final Logger logger = Logger.getLogger(ClientApplication.class.getName());
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//get handler class objects.
		Handler fileHandler = null;
		Handler consoleHandler = null;
		Formatter simpleFormatter = new SimpleFormatter();
		
		fileHandler =new FileHandler("./mindgame.log");
		consoleHandler = new ConsoleHandler();
		//set format to logger
		fileHandler.setFormatter(simpleFormatter);
	
		//add handler objects to logger
		logger.addHandler(consoleHandler);
		logger.addHandler(fileHandler);
		//setting levels to handler
		fileHandler.setLevel(Level.ALL);
		//consoleHandler.setLevel(Level.ALL);
		logger.setLevel(Level.ALL);
		
		logger.config("Configuration done.");
		logger.log(Level.FINE, "Finer logged");
		
		//apply log filter
		logger.setFilter(new ClientApplication());
		logger.severe("this message shows my name Adarsh Chauhan");
		logger.warning("this message will not show my name");
		/*
		 * logger.info("Logger Name : "+logger.getName());
		 * logger.info("Logger Resource Bundle Name : "+logger.getResourceBundleName());
		 * logger.log(Level.WARNING,"Log Warning");
		 */
		
		//Locating Spring configuration file and activate spring container.
		//by default spring container looks spring configuration file into src/main/resources folder of spring project.
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring_cfg_mysql_db.xml");
		
		//logger.info("Logger Container : "+container);
		
		//	another way to activate spring container	
		//GenericApplicationContext container = new GenericApplicationContext();
		//new XmlBeanDefinitionReader(container).loadBeanDefinitions("spring_cfg_wishMessageShow.xml");
		//container.refresh();
		
		//by without exposing the client to get spring bean class object from spring container
		Object obj = container.getBean("sb");
		
	//	logger.info("Spring Bean object : "+obj);
		
		// get reference of spring beans
		Select demo = (Select)obj;
	
		//call business methods
		System.out.println(demo.fetchUsername(101));
		System.out.println(demo.fetchCity(101));
		System.out.println("------------ Full Record ---------");
		System.out.println(demo.fetchUser(101));
		System.out.println(demo.fetchUser(101));
		
		logger.finer("this is last statement of main() method........");
	}
	
	
	public boolean isLoggable(LogRecord record) {
		// TODO Auto-generated method stub
		if (record ==  null) {
			return false;
		}
		
		String message = record.getMessage() == null?"":record.getMessage();
		if (message.contains("Adarsh Chauhan")) {
			return true;
		}
		return false;
	}
}
