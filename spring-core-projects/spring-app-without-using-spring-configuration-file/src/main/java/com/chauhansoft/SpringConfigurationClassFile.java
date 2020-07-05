package com.chauhansoft;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.chauhansoft")
@PropertySource("demo-bean-info")
public class SpringConfigurationClassFile {

	//create beans like in spring xml configuration file 
	
//	@Bean
//	public DemoBean demoBean() {
//		return new DemoBean();
//	}
	
}
