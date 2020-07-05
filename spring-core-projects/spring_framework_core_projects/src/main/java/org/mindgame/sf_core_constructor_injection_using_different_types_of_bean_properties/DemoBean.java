package org.mindgame.sf_core_constructor_injection_using_different_types_of_bean_properties;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class DemoBean implements Demo {

	//spring bean property
	private String name;
	private Date d;
	private List names;
	private Set phones;
	private Map capitals;
	private Properties books;
	
	public DemoBean() {
		// TODO Auto-generated constructor stub
		System.out.println("0-param constructor");
	}
	
	public DemoBean(String name, Date d, List names, Set phones, Map capitals, Properties books) {
		super();
		this.name = name;
		this.d = d;
		this.names = names;
		this.phones = phones;
		this.capitals = capitals;
		this.books = books;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return name+" \n"+d+" \n"+names+" \n"+phones+" \n"+capitals+" \n"+books;
	}
}
