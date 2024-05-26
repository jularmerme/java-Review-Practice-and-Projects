package net.home;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time1 = "12:45:54PM";
		String time2 = "01:01:00PM";
		
		String hours = time1.substring(0, 2);
		String mins  = time1.substring(3, 5);
		String secs  = time1.substring(6,8);
		String timeFormat = time1.substring(8, 10);
		
		System.out.println(hours + " : " + mins + " : " + secs + " " + timeFormat);
		
		if(timeFormat.equals("PM")) {
			if(hours.equals("12")) {
				hours = "12";
			} else {
				hours = String.valueOf(Integer.parseInt(hours) + 12);
			}
		} else {
			if(hours.equals("12")) 
				hours = "00";
		}
		
		System.out.println(hours +":"+mins+":"+secs);
		
	}

}
