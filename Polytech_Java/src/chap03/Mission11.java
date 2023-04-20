package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission11 {

	public static void main(String[] args) {
		// do-while 문을 이용하여 
		// 'a'부터 'z'까지 출력하는 프로그램을 작성하시오.

		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c + 1);
			
			} while(c <= 'z');
		
		}
	
	}