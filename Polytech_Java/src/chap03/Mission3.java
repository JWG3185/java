package chap03;

import java.util.Random;
import java.util.Scanner;

// up-down 게임
// 사용자: 1~99까지의 값을 입력
// 컴퓨터: 1~99까지의 값을 생성
// 사용자가 컴퓨터의 값을 맞추면 성공!
// 사용자 > 컴퓨터 down!
// 사용자 < 컴퓨터 up!
// 최대 횟수 trial = 7회
// 성공: 이겼다!!!
// 실패: 시도횟수, 실패!
		


public class Mission3 {

	public static void main(String[] args) {
		// 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 랜덤 불러오기
		Random rand = new Random();
		
		
		
		// <컴퓨터의 값을 생성>
		// 1. 랜덤값 계수 변경(변하게 하기 위해)
		rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		
		// 2. 1~99까지의 랜덤값
		int com = 1 + rand.nextInt(99);
		System.out.println(com);
		
		// while 문 안에 들어갈 변수 생성
		int count = 0;					// 시도 횟수
		final int TRY_NUMBER = 7;		// 최대 횟수, 상수
		boolean state = true;			// 최대 횟수안에 성공 / 실패
		
		// 반복을 한다(최대 횟수까지!)
		while(true) 								
			{
			// 시도 횟수 변수
			count++;		
			// 탈출 조건 생성
			if(count > TRY_NUMBER) 		// 시도 횟수와 최대 횟수 비교
				{
				state = false;			// 최대 횟수 초과할 때 상태 변경
				break;
				}
			
			System.out.println("< " + count + "번의 시도 >");
			System.out.print("숫자를 입력하세요(1~99) >> ");
			
			// 유저의 값 생성
			int user = sc.nextInt();
			
			// 유저값과 컴퓨터의 값을 비교하기 위한 변수 생성
			int result = com - user;
			
			if 		(result > 0)									// 유저값이 작을 경우
			System.out.println("     " + user + "보다 Up!");		
			else if (result < 0)									// 유저값이 클 경우
			System.out.println("     " + user + "보다 Down!");
			else					
				break;
			}
		
		System.out.println("=====================================");	
		if (state)	
			System.out.println(count + "회만에 맞췄습니다! 당신의 승리!");
		else		
			System.out.println(TRY_NUMBER + "회의 기회를 소진하셨습니다. 시도 횟수는 " + (count-1));

		sc.close();
	}

}
