package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission12_1 {

	public static void main(String[] args) {
		// �迭 �ٷ��
		int lotto[] = {12, 7, 32, 2, 5, 8};
		int lotto_num[] = new int[7];
		
		// �迭�� �� �Է�
		for (int i = 0; i < 7; i++)
		{
			lotto_num[i] = 1 + (int)(Math.random() * 45);	// 1 ~ 45������ ���� ����
			for (int j = 0; j < i; j++) 
			{
				if (lotto_num[i] == lotto_num[j])
				{
					i--;
				}
			}
		}
				
		// 1) �迭�� �� ���
		for (int i = 0; i < 7; i ++)
		{
			System.out.printf("%5d",lotto_num[i]);
		}
		
		// 2) foreach���� �̿��� �迭�� ���� ���� ���
//		for (int num: lotto_num) 
//		{
//			System.out.printf("%5d",num);
//		}
		
		
		// �ζ� � �¾Ҵ���
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