package com.chauhansoft;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HardwareEngineer implements Engineer{

	public void development() {
		// TODO Auto-generated method stub
		System.out.println("Hardware development....");
	}

}
