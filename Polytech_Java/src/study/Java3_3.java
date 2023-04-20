package study;

import java.util.Scanner;

public class Java3_3 {

	public static void main(String[] args) {
		// 6. 369게임
		// 입력값 1~99의 정수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1>>");
		int num = sc.nextInt(); 
		
		int num10 = num/10;
		int num1 = num%10;
		
		if (num10 == 3 || num10 == 6 || num10 == 9)		// 십의 자리가 369가 포함된 경우
		{	
			if (num1 == 3 || num1 == 6 || num1 == 9)	// 일의 자리에 369가 포함된 경우
				System.out.println("박수짝짝");
			else										// 십의 자리에만 369가 포함되고,
				System.out.println("박수짝");				// 일의 자리에는 369가 포함 안된 경우
		}
		else											// 십의 자리에 369가 포함 안된 경우
		{
			if (num1 == 3 || num1 == 6 || num1 == 9)	// 일의 자리에만 369가 포함되고, 
				System.out.println("박수짝");				// 십의 자리에는 369가 포함 안된 경우
			else										// 십의 자리, 일의 자리 둘다 369가 포함 안된 경우 
				System.out.println(num);	
		}
		
		sc.close();
	}

}
