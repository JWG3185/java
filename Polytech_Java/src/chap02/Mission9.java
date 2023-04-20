package chap02;

// switch 문 활용
// 사용자로부터 month 를 정수로 입력받아서
// month의 days를 출력해주세요.
// month : 2 - 28일, 4,5,9,11 - 30일, 기타 - 31일

import java.util.Scanner;

public class Mission9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요.(1~12) >> ");
		int month = sc.nextInt();
		
		int days = 0;
		
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		
		System.out.println(month + "월은 " + days + "일입니다.");
		sc.close();
	}

}
