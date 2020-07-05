package com.chauhansoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.chauhansoft")
@PropertySource("demo-bean-info")
public class SpringConfigurationClassFile {

	//create beans like in spring xml configuration file 
	//if we are using the @Component annotation then we must have to write @ComponentScan(basePackages = "com.chauhansoft") annotation.
	//if we are @Bean annottaion then we no need to write @Component and @ComponentScan(basePackages = "com.chauhansoft") annotations becoz
	// both are same things.
	

//	@Bean
//	public SoftwareEngineer engineer() {
//		return new SoftwareEngineer();
//	}
//	
//	@Bean
//	public DemoBean demoBean() {
//		DemoBean demoBean = new DemoBean();
//		demoBean.setEngineer(engineer());
//		return demoBean;
//	}
	
}
