package chap02;

import java.util.Scanner;

public class Mission6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하시오 (cm) : ");
		int height = sc.nextInt();
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		
		// 조건문
//		if (height >= 140 && age >=10) 	System.out.println("타도 좋아요!");
//		else							System.out.println("못 타요!");
	
		// 조건 연산자
		String msg = (height >= 140 && age >=10) ?
				"타도 좋아요!"
				: "못 타요!";
		System.out.println(msg);
		
		sc.close();
	}

}
