package chap02;

import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 입력 >> ");
		int time = sc.nextInt();

		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		int price = 0;
		
		// 중첩 if문
		if 		(time>=9 && time<=18)		//주간권	
		{
			if (age<=7 || age>=75) 	price = 15000; 	// 소인/노인
			else					price = 30000;	// 대인
		}
		else 								//야간권
		{
			if (age<=7 || age>=75) 	price = 10000;	// 소인/노인
			else					price = 20000;	// 대인
			
		}
		
		System.out.println("요금은 " + price + "원 입니다.");
		
		sc.close();
	}

}
