package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission12 {

	public static void main(String[] args) {
		// �迭 �ٷ��

		int lotto_num[] = new int[7];
		//String names[] = {"������", "����ȣ", "������"};
		
		// �迭�� �� �Է�
		for (int i = 0; i < 7; i ++)
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
//		for (int i = 0; i < 7; i ++)
//		{
//			System.out.printf("%5d",lotto_num[i]);
//		}
		
		// 2) foreach���� �̿��� �迭�� ���� ���� ���
		for (int num: lotto_num) 
		{
			System.out.printf("%5d",num);
		}
		
		//for (String name: names) 
		//{
		//	System.out.printf("%5s",name);
		//}
		
		}
	}