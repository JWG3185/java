package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission10 {

	public static void main(String[] args) {
		// do while문을 이용하여 정수를 여러 개 입력 받고 평균을 출력하라. 
		//-1이 입력되면 입력을 종료한다.

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요(끝내려면 -1을 입력) >> ");
		
		int sum = 0;					// 입력된 수들의 합
		int count = 0;					// 입력된 수의 개수
		double avg = 0.0;				// 입력된 수의 평균
		
		int n = 0;
		
		do{ 							
			sum += n;
			count++;
			n = scanner.nextInt();
		} while(n != -1);
		
		count = count - 1;
		
		if (count == 0)
			System.out.println("평균을 구할 수가 없습니다.");
		else
		{
		avg = (double)sum/count;
		System.out.println("정수의 개수는 " + count + "개 ");
		System.out.printf("평균은 %.2f입니다.", avg);
		}
		
		scanner.close();
		}
	
	}