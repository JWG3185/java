package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission12_1 {

	public static void main(String[] args) {
		// 배열 다루기
		int lotto[] = {12, 7, 32, 2, 5, 8};
		int lotto_num[] = new int[7];
		
		// 배열의 값 입력
		for (int i = 0; i < 7; i++)
		{
			lotto_num[i] = 1 + (int)(Math.random() * 45);	// 1 ~ 45까지의 난수 생성
			for (int j = 0; j < i; j++) 
			{
				if (lotto_num[i] == lotto_num[j])
				{
					i--;
				}
			}
		}
				
		// 1) 배열의 값 출력
		for (int i = 0; i < 7; i ++)
		{
			System.out.printf("%5d",lotto_num[i]);
		}
		
		// 2) foreach문을 이용한 배열의 값들 각각 출력
//		for (int num: lotto_num) 
//		{
//			System.out.printf("%5d",num);
//		}
		
		
		// 로또 몇개 맞았느냐
		System.out.println();
		int count = 0;
		for (int num1: lotto_num)
		{
			for (int num2: lotto) 
			{
				if(num1==num2)
					count++;
			}
		}
		System.out.println(count);
		
		}
	}