package chap02;

import java.util.Scanner;

public class Mission6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� (cm) : ");
		int height = sc.nextInt();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age = sc.nextInt();
		
		// ���ǹ�
//		if (height >= 140 && age >=10) 	System.out.println("Ÿ�� ���ƿ�!");
//		else							System.out.println("�� Ÿ��!");
	
		// ���� ������
		String msg = (height >= 140 && age >=10) ?
				"Ÿ�� ���ƿ�!"
				: "�� Ÿ��!";
		System.out.println(msg);
		
		sc.close();
	}

}
