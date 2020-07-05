package org.mindgame.sf_core_wishMessageShow;
import java.util.Calendar;
public class DemoBean implements Demo {

	//spring bean property
	private String msg;
	
	public DemoBean() {
		// TODO Auto-generated constructor stub
		System.out.println("0-param constructor");
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("setMsg()...........");
	}

	public String generateWishMessage(String uname) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		int hours = cl.get(Calendar.HOUR_OF_DAY);
		System.out.println("Hours of Day : "+hours);
		if (hours <12) {
			return msg = msg+" Mr. "+uname+" -> Good Morning.";
		} else if(hours <16){
			return msg = msg+" Mr. "+uname+" -> Good Afternoon.";
		}else if(hours <20){
			return msg = msg+" Mr. "+uname+" -> Good Evening.";
		}
		else {
			return msg = msg+" Mr. "+uname+" -> Good Night.";
		}
	}

}
