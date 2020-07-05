package org.mindgame.sf_core_BeanPostProcessor_interface_using_multiple_beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ProcessorBean implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object obj,String beanName)throws BeansException{
		System.out.println(" postProcessBeforeInitialization() called............(2)........");
		DemoBean newBean = null;
		if (obj.getClass() == DemoBean.class) {
			newBean = (DemoBean)obj;
			newBean.msg = beanName;
			newBean.msg = newBean.msg+" How r u....";
		}
		return newBean;
	}
	public Object postProcessAfterInitialization(Object obj,String beanName)throws BeansException{
		System.out.println(" postProcessAfterInitialization() called............(3)........");
		return obj;
	}
}
