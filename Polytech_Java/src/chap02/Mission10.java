package chap02;

import java.util.Random;
import java.util.Scanner;

// user �� com �� �ִ�.
// user�� 1,2,3 - ���� ���� ��
// com�� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�



public class Mission10 {

	public static String fingerresult(int x) {
		if (x == 0)
			return "�̰���ϴ�.";
		else if (x==1)
			return "�����ϴ�.";
		else if (x==2)
			return "�����ϴ�.";
		else 
			return "�ٽ� �������ּ���.";
	}
	
	public static String fingergame(int x) {
		if (x == 1)
			return "����";
		else if (x==2)
			return "����";
		else 
			return "��";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����(1), ����(2), ��(3)�� ������. >> ");
		int user = sc.nextInt();
		
		// 1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ���� (0 <= Math.random() < 1)

//		int com = (int)(1 + Math.random() * 3);		// 1~3������ ����

		// 2) Random() Ŭ������ nextInt, nextDouble... �� ����Ͽ� ������ ����
		Random rand = new Random();
		int com = 1 + rand.nextInt(3);
		
		int result = 0; 
		
		switch(user) {
			case 1:
				if  	(com == 3) 	result = 0;
				else if (com == 1) 	result = 1;
				else				result = 2;
					break;
			case 2:
				if  	(com == 1) 	result = 0;
				else if (com == 2)	result = 1;
				else				result = 2;
					break;
			case 3:
				if  	(com == 2) 	result = 0;
				else if (com == 3)	result = 1;
				else				result = 2;
					break;
			default:
									result = 4;
					break;
		}
		
		System.out.println("����� " + fingergame(user) + "�� �½��ϴ�.");
		System.out.println("��ǻ�ʹ� " + fingergame(com) + "�� �½��ϴ�.");	
		System.out.println("����� " + fingerresult(result));
		
		
//		//<������ Ǯ��>
//		int result = user - com;
//		
//		System.out.println("��ǻ�ʹ� " + fingergame(com) + "�� �½��ϴ�.");
//		
//		if 		(result ==0)					System.out.println("���º�!");
//		else if (result == -1 || result == 2) 	System.out.println("��ǻ�� ��!");
//		else									System.out.println("����� ��!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
