package org.mindgame.sf_core_collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DemoBean implements Demo {

	//spring bean property
	private String name;
	private Date d;
	private String colors[];
	private List faculties;
	private Set phones;
	private Map fruits;
	private Properties capitals;
	
	public DemoBean() {
		// TODO Auto-generated constructor stub
		System.out.println("0-param constructor");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public void setFaculties(List faculties) {
		this.faculties = faculties;
	}  

	
	public void setPhones(Set phones) {
		this.phones = phones;
	}

	public void setFruits(Map fruits) {
		this.fruits = fruits;
	}

	public void setCapitals(Properties capitals) {
		this.capitals = capitals;
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		String colorName="";
		for (int i = 0; i < colors.length; i++) {
			
			colorName = colorName+ colors[i]+", ";
			//System.out.print(colors[i]);
		}
		
		return name+" "+d+" " +" "+faculties+" "+"["+colorName+"]"+phones+" "+fruits+" "+capitals;
	}
}
