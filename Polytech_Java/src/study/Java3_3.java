package study;

import java.util.Scanner;

public class Java3_3 {

	public static void main(String[] args) {
		// 6. 369����
		// �Է°� 1~99�� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1>>");
		int num = sc.nextInt(); 
		
		int num10 = num/10;
		int num1 = num%10;
		
		if (num10 == 3 || num10 == 6 || num10 == 9)		// ���� �ڸ��� 369�� ���Ե� ���
		{	
			if (num1 == 3 || num1 == 6 || num1 == 9)	// ���� �ڸ��� 369�� ���Ե� ���
				System.out.println("�ڼ�¦¦");
			else										// ���� �ڸ����� 369�� ���Եǰ�,
				System.out.println("�ڼ�¦");				// ���� �ڸ����� 369�� ���� �ȵ� ���
		}
		else											// ���� �ڸ��� 369�� ���� �ȵ� ���
		{
			if (num1 == 3 || num1 == 6 || num1 == 9)	// ���� �ڸ����� 369�� ���Եǰ�, 
				System.out.println("�ڼ�¦");				// ���� �ڸ����� 369�� ���� �ȵ� ���
			else										// ���� �ڸ�, ���� �ڸ� �Ѵ� 369�� ���� �ȵ� ��� 
				System.out.println(num);	
		}
		
		sc.close();
	}

}
