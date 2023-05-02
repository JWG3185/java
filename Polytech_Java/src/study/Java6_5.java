package study;

import java.util.Calendar;

public class Java6_5 {

	
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		
		int h_d = cal.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("현재 시간은 " + hour + "시 " + min + "분입니다.");
		
		if(h_d>=4 && h_d <12)
			System.out.println("Good Morning");
		else if(h_d>=12 && h_d <18)
			System.out.println("Good Afternoon");
		else if(h_d>=18 && h_d <22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
		
	}
	
}
