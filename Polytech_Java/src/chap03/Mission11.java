package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission11 {

	public static void main(String[] args) {
		// do-while ���� �̿��Ͽ� 
		// 'a'���� 'z'���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c + 1);
			
			} while(c <= 'z');
		
		}
	
	}