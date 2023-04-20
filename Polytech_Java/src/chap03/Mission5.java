package chap03;

import java.util.Random;
import java.util.Scanner;

// Q) 1 ~ 100까지의 수 중에서 3의 배수만 합산한 결과(sum)을 출력하라.
		
public class Mission5 {

	public static void main(String[] args) {
		// 1. 1~100까지의 숫자 중의 13의 배수만 합산하라.
		// 1) for문
		int sum = 0;
		
		for (int num = 1; num <= 100; num++)
		{
			if(num % 13 == 0)	sum += num;
		}
		System.out.println("=== 1번 ===");
		System.out.println("sum = " + sum);
		
		// 2. 1~100까지의 숫자 중의 13이 되기 전까지만 합산하라.
		// 2) break문
		sum = 0;
		
		for (int num = 1; num <= 100; num++)
		{
			if(num % 13 == 0)	break;
			sum += num;
		}
		System.out.println("=== 2번 ===");
		System.out.println("sum = " + sum);
		
		// 3. 1~100까지의 숫자 중의 13의 배수를 제외한 숫자만 합산하라.
		// 3. continue문 -- 누락시키기 위한 것!!!
		sum = 0;
				
		for (int num = 1; num <= 100; num++)
		{
			if(num % 13 == 0)	continue;
			sum += num;
		}
		System.out.println("=== 3번 ===");
		System.out.println("sum = " + sum);
		
	}
	

}
