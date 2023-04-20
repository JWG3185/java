package chap03;

import java.util.Random;
import java.util.Scanner;

// up-down ����
// �����: 1~99������ ���� �Է�
// ��ǻ��: 1~99������ ���� ����
// ����ڰ� ��ǻ���� ���� ���߸� ����!
// ����� > ��ǻ�� down!
// ����� < ��ǻ�� up!
// �ִ� Ƚ�� trial = 7ȸ
// ����: �̰��!!!
// ����: �õ�Ƚ��, ����!
		


public class Mission3 {

	public static void main(String[] args) {
		// ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// ���� �ҷ�����
		Random rand = new Random();
		
		
		
		// <��ǻ���� ���� ����>
		// 1. ������ ��� ����(���ϰ� �ϱ� ����)
		rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		
		// 2. 1~99������ ������
		int com = 1 + rand.nextInt(99);
		System.out.println(com);
		
		// while �� �ȿ� �� ���� ����
		int count = 0;					// �õ� Ƚ��
		final int TRY_NUMBER = 7;		// �ִ� Ƚ��, ���
		boolean state = true;			// �ִ� Ƚ���ȿ� ���� / ����
		
		// �ݺ��� �Ѵ�(�ִ� Ƚ������!)
		while(true) 								
			{
			// �õ� Ƚ�� ����
			count++;		
			// Ż�� ���� ����
			if(count > TRY_NUMBER) 		// �õ� Ƚ���� �ִ� Ƚ�� ��
				{
				state = false;			// �ִ� Ƚ�� �ʰ��� �� ���� ����
				break;
				}
			
			System.out.println("< " + count + "���� �õ� >");
			System.out.print("���ڸ� �Է��ϼ���(1~99) >> ");
			
			// ������ �� ����
			int user = sc.nextInt();
			
			// �������� ��ǻ���� ���� ���ϱ� ���� ���� ����
			int result = com - user;
			
			if 		(result > 0)									// �������� ���� ���
			System.out.println("     " + user + "���� Up!");		
			else if (result < 0)									// �������� Ŭ ���
			System.out.println("     " + user + "���� Down!");
			else					
				break;
			}
		
		System.out.println("=====================================");	
		if (state)	
			System.out.println(count + "ȸ���� ������ϴ�! ����� �¸�!");
		else		
			System.out.println(TRY_NUMBER + "ȸ�� ��ȸ�� �����ϼ̽��ϴ�. �õ� Ƚ���� " + (count-1));

		sc.close();
	}

}
