package chap03;

import java.util.Random;
import java.util.Scanner;

// 1. while�� Ȱ�� : 1~10������ ��(num)�� �ջ��Ͽ� �����(sum)�� ����Ͻÿ�.
		


public class Mission4 {

	public static void main(String[] args) {
	
		// 1. while���� ���� ������ Ȯ���� �� ����!
//		int num = 1;
//		int sum = 0;			//������ (�ʱ�ȭ�� �׻� 0)
		
//		while(num<=10) 
//		{
//			sum += num;
//			num++;
//		}
//		System.out.println("===While��===");
//		System.out.println("sum = " + sum);
		
		// 2. Do while��
		
		int num = 1;
		int sum = 0;			//������ (�ʱ�ȭ�� �׻� 0)
			
		do 
		{
			sum += num;
			num++;
		} while(num<=10);
		
		System.out.println("===Do while��===");
		System.out.println("sum = " + sum);
		
		
		// 3. for���� Ƚ���� ������ ���� �� ����!!!
//		int summ = 0;
		
//		for (int numb = 1; numb <= 10; numb++)
//		{
//			summ += numb;
//		}
//		System.out.println("=== For�� ===");
//		System.out.println("summ = " + summ);
//		
	}
	

}
