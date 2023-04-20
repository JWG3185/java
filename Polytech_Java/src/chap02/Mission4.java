package chap02;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리 수 정수 입력(10~99) >> ");
		int num = sc.nextInt();
		
		int num10 = num/10;
		int num1 = num%10;
		
		// 조건 연산자 활용
//		String msg = (num10 == num1) ? 
//			"Yes! 10의 자리와 1의 자리가 같습니다."
//			: "No...ㅜㅜ. 10의 자리와 1의 자리가 다릅니다." ;
//		System.out.println(msg);
			
		// 조건문 if 활용
		String msg;
		if (num10 == num1)	msg = "Yes! 10의 자리와 1의 자리가 같습니다.";			
		else				msg = "No...ㅜㅜ. 10의 자리와 1의 자리가 다릅니다.";
		System.out.println(msg);
		
		// 한줄을 넘어가면 중괄호{}를 씌워줘야함
//		String msg;
//		if (num10 == num1)	{msg = "Yes! 10의 자리와 1의 자리가 같습니다."
//							~~~~~~~~~~~~~~~	;}	
//		else				{msg = "No...ㅜㅜ. 10의 자리와 1의 자리가 다릅니다."
//							~~~~~~~~~~~~~~~	;}
//		System.out.println(msg);

		sc.close();
	}

}
