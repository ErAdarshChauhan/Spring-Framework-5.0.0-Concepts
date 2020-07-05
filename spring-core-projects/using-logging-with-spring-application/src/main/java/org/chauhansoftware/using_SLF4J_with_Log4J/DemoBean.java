package org.chauhansoftware.using_SLF4J_with_Log4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoBean implements Demo{

	private String msg;
	
	private final Logger logger = LoggerFactory.getLogger(DemoBean.class);
	
	public void setMsg(String msg) {
		this.msg = msg;
		logger.info("Message from Spring Bean : "+msg);
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		logger.info("calling business method sayHello()");
		return msg;
	}
	
}
