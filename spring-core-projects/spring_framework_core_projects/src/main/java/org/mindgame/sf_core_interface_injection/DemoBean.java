package org.mindgame.sf_core_interface_injection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DemoBean implements Demo,BeanNameAware,BeanFactoryAware,ApplicationContextAware {

	private String beanId;
	private BeanFactory beanFactory;
	private ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx = applicationContext;
		System.out.println("ctx is : "+ctx.getClass());
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.beanFactory = beanFactory;
		System.out.println("beanFactory : "+this.beanFactory.getClass());
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanId = name;
		System.out.println("Bean id : "+beanId);
	}
	
	public String sayHello() {
		// TODO Auto-generated method stub
		
		//count spring beans class
		int beans = ctx.getBeanDefinitionCount();
		System.out.println("No. of beans : "+beans);
		//get beanNames
		String beansName[] = ctx.getBeanDefinitionNames();
		for (int i = 0; i < beansName.length; i++) {
			System.out.println(beansName[i]);
		}
		
		//get other beans object
		System.out.println(ctx.getBean("dt"));
		return "Hi";
	}
}
