package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission7 {

	public static void main(String[] args) {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		for (int x =1 ; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.print("*");		// 별 그리고
			}
			System.out.println();			// 밑으로 한줄
		}
		System.out.println("5 X 5 별 그리기 완성!!!");
		
		// *****
		// *****
		// *****
		// *****
		// *****
		for (int x =1 ; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");		// 별 그리고
			}
			System.out.println();			// 밑으로 한줄
		}
		System.out.println("===============");
		
		for (int x =5 ; x > 0; x--) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");		// 별 그리고
			}
			System.out.println();			// 밑으로 한줄
		}
		
	}
	
}
