package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission9 {

	public static void main(String[] args) {
		// 달력만들기
		
		for (int x = 1 ; x <= 31; x++) 
		{
			if (x != 1 && x % 7 == 1) 
				{	
					System.out.println();
				}
			System.out.printf("%5d", x);
		}
		
		//교수님 풀이
		System.out.println();
		int count = 0;
		for(int i=1;i<=31;i++) {
			
			count++;
			System.out.printf("%5d", i);
			
			if (count%7==0) {
				System.out.println();
			}	
		}
		
		}
	
	}