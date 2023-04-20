package chap03;

import java.util.Random;
import java.util.Scanner;

// 1. while문 활용 : 1~10까지의 수(num)를 합산하여 결과값(sum)을 출력하시오.
		


public class Mission4 {

	public static void main(String[] args) {
	
		// 1. while문은 종료 조건이 확실할 때 좋음!
//		int num = 1;
//		int sum = 0;			//누적합 (초기화는 항상 0)
		
//		while(num<=10) 
//		{
//			sum += num;
//			num++;
//		}
//		System.out.println("===While문===");
//		System.out.println("sum = " + sum);
		
		// 2. Do while문
		
		int num = 1;
		int sum = 0;			//누적합 (초기화는 항상 0)
			
		do 
		{
			sum += num;
			num++;
		} while(num<=10);
		
		System.out.println("===Do while문===");
		System.out.println("sum = " + sum);
		
		
		// 3. for문은 횟수가 정해져 있을 때 좋음!!!
//		int summ = 0;
		
//		for (int numb = 1; numb <= 10; numb++)
//		{
//			summ += numb;
//		}
//		System.out.println("=== For문 ===");
//		System.out.println("summ = " + summ);
//		
	}
	

}
