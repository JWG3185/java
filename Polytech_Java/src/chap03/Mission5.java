package chap03;

import java.util.Random;
import java.util.Scanner;

// Q) 1 ~ 100������ �� �߿��� 3�� ����� �ջ��� ���(sum)�� ����϶�.
		
public class Mission5 {

	public static void main(String[] args) {
		// 1. 1~100������ ���� ���� 13�� ����� �ջ��϶�.
		// 1) for��
		int sum = 0;
		
		for (int num = 1; num <= 100; num++)
		{
			if(num % 13 == 0)	sum += num;
		}
		System.out.println("=== 1�� ===");
		System.out.println("sum = " + sum);
		
		// 2. 1~100������ ���� ���� 13�� �Ǳ� �������� �ջ��϶�.
		// 2) break��
		sum = 0;
		
		for (int num = 1; num <= 100; num++)
		{
			if(num % 13 == 0)	break;
			sum += num;
		}
		System.out.println("=== 2�� ===");
		System.out.println("sum = " + sum);
		
		// 3. 1~100������ ���� ���� 13�� ����� ������ ���ڸ� �ջ��϶�.
		// 3. continue�� -- ������Ű�� ���� ��!!!
		sum = 0;
				
		for (int num = 1; num <= 100; num++)
		{
			if(num % 13 == 0)	continue;
			sum += num;
		}
		System.out.println("=== 3�� ===");
		System.out.println("sum = " + sum);
		
	}
	

}
