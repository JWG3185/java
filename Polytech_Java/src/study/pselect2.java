package study;

import java.util.Random;
import java.util.Scanner;

public class pselect2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// ��ǥ�� ��� �̱� {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		String P[] = {"�迩��","������","���ؼ�","���ʺ�","�ڱԸ�","�ڹα�",					//��ü �ο� �迭		
				"�ڽ���","���ֿ�","������","�ɼҿ�","������","������","�̼���",
				"������","������","������","����ȣ","���º�","������","���Ƹ�","������"};
		
		System.out.print("��ǥ�� ���� �Է��ϼ���>> ");									//��ǥ�� �� �̱�
		int num = sc.nextInt();
	
	
		int pt[] = new int[num];										//��ǥ�� ����ŭ ���� �̾Ƽ� ���� �迭
		
		for (int i = 0; i < num; i ++)
		{
			pt[i] =(int)(Math.random() * (21));	// 0 ~ 20������ ������ num�� ����
			for (int j = 0; j < i; j++) 
			{
				if (pt[i] == pt[j])
				{
					i--;
				}
			}
		}
		
		for (int nu: pt) 												// ������ �ε����� ��ǥ�� �̱�
		{
			System.out.printf("%5s",P[nu]);
		}
		
		
	}

}
