package chap02;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�ڸ� �� ���� �Է�(10~99) >> ");
		int num = sc.nextInt();
		
		int num10 = num/10;
		int num1 = num%10;
		
		// ���� ������ Ȱ��
//		String msg = (num10 == num1) ? 
//			"Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�."
//			: "No...�̤�. 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�." ;
//		System.out.println(msg);
			
		// ���ǹ� if Ȱ��
		String msg;
		if (num10 == num1)	msg = "Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.";			
		else				msg = "No...�̤�. 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.";
		System.out.println(msg);
		
		// ������ �Ѿ�� �߰�ȣ{}�� ���������
//		String msg;
//		if (num10 == num1)	{msg = "Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�."
//							~~~~~~~~~~~~~~~	;}	
//		else				{msg = "No...�̤�. 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�."
//							~~~~~~~~~~~~~~~	;}
//		System.out.println(msg);

		sc.close();
	}

}
