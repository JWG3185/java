package chap02;

import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ð� �Է� >> ");
		int time = sc.nextInt();

		System.out.print("���� �Է� >> ");
		int age = sc.nextInt();
		
		int price = 0;
		
		// ��ø if��
		if 		(time>=9 && time<=18)		//�ְ���	
		{
			if (age<=7 || age>=75) 	price = 15000; 	// ����/����
			else					price = 30000;	// ����
		}
		else 								//�߰���
		{
			if (age<=7 || age>=75) 	price = 10000;	// ����/����
			else					price = 20000;	// ����
			
		}
		
		System.out.println("����� " + price + "�� �Դϴ�.");
		
		sc.close();
	}

}
