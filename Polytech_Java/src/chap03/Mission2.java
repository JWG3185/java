package chap03;

import java.util.Random;
import java.util.Scanner;

// user 와 com 이 있다.
// user는 1,2,3 - 가위 바위 보
// com은 random 하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
// if 또는 switch 중에 결정해서 프로그램 작성



public class Mission2 {

	public static String fr(int x) {
		if (x == 0)
			return "이겼습니다.";
		else if (x==1)
			return "비겼습니다.";
		else if (x==2)
			return "졌습니다.";
		else 
			return "다시 실행해주세요.";
	}
	
	public static String fingergame(int x) {
		if (x == 1)
			return "가위";
		else if (x==2)
			return "바위";
		else 
			return "보";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		// 1) Math.random() 메소드를 활용해서 난수를 생성 (0 <= Math.random() < 1)

//		int com = (int)(1 + Math.random() * 3);		// 1~3사이의 난수

		// 2) Random() 클래스의 nextInt, nextDouble... 를 사용하여 난수를 생성
		Random rand = new Random();
		
//		int count = 0;								// 횟수 체크할 변수
//		final int TRY_NUMBER = 10;					// 최대 횟수 정하기
//		
//		while(true) {								// 반복문
//			count++;								// 카운트에 +1
//			if (count > TRY_NUMBER)	break;			// 3이 되면 탈출
//			
//			System.out.print("가위(1), 바위(2), 보(3)를 내세요. >> ");
//			int user = sc.nextInt();
//			
//			int com = 1 + rand.nextInt(3);
//			
//			int result = 0; 
//			
//			switch(user) {
//				case 1:
//					if  	(com == 3) 	result = 0;
//					else if (com == 1) 	result = 1;
//					else				result = 2;
//						break;
//				case 2:
//					if  	(com == 1) 	result = 0;
//					else if (com == 2)	result = 1;
//					else				result = 2;
//						break;
//				case 3:
//					if  	(com == 2) 	result = 0;
//					else if (com == 3)	result = 1;
//					else				result = 2;
//						break;
//				default:
//										result = 4;
//						break;
//			}
//			System.out.println(count);
//			System.out.println("당신은 " + fingergame(user) + "를 냈습니다.");
//			System.out.println("컴퓨터는 " + fingergame(com) + "를 냈습니다.");	
//			System.out.println("당신은 " + fr(result));
//		}
//		
		//<교수님 풀이>
			
		int count = 0;								// 횟수 체크할 변수
		final int TRY_NUMBER = 10;
		boolean state = true; 						// 상태가 성공임을 가정
		
		while(true) {
			count++;							
			if (count > TRY_NUMBER)	{
				state = false;
				break;
				}	
			
			System.out.print("가위(1), 바위(2), 보(3)를 내세요. >> ");
			int user = sc.nextInt();
			
			int com = 1 + rand.nextInt(3);
			
			int result = user - com;
			
			System.out.println("컴퓨터는 " + fingergame(com) + "를 냈습니다.");
			
			if 		(result ==0)					System.out.println("무승부!");
			else if (result == -1 || result == 2) 	System.out.println("컴퓨터 승!");
			else	{
				System.out.println("사용자 승!");
				break;
					}
		}
		System.out.println("=====================================");	
		if (state)	System.out.println(count + "회만에 이기셨습니다. 당신의 승리!");
		else		System.out.println(TRY_NUMBER + "회의 기회를 소진하셨습니다.");
		sc.close();
	}

}
