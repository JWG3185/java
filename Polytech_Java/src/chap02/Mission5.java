package chap02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		// ���������� (����, ����)
//		int a = 10, b = 20, c = 30, d = 40;
//		c = ++a - b-- + d--;
//		
//		System.out.println(a);//11
//		System.out.println(c);//31
//		System.out.println(b);//19
//		System.out.println(d);//39
		
		// �밡��
		Scanner sc = new Scanner(System.in);
		System.out.print("�޾��� �Է��Ͻÿ� >> ");
		int won = sc.nextInt();
		int ������ = won/50000;
		int ������������ = won%50000;
		int ���� = ������������/10000;
		int ���������� = ������������%10000;
		int õ�� = ����������/1000;
		int õ�������� = ����������%1000;
		int ��� = õ��������/100;
		int ��������� = õ��������%100;
		int ���ʿ� = ���������/50;
		int ���ʿ������� = ���������%50;
		int �ʿ� = ���ʿ�������/10;
		int �Ͽ� = ���ʿ�������%10;
		
		System.out.println("�������� : " + ������ + "��");
		System.out.println("������ : " + ���� + "��");
		System.out.println("õ���� : " + õ�� + "��");
		System.out.println("����� : " + ��� + "��");
		System.out.println("���ʿ��� : " + ���ʿ� + "��");
		System.out.println("�ʿ��� : " + �ʿ� + "��");
		System.out.println("�Ͽ��� : " + �Ͽ� + "��");
		
		sc.close();
	}

}
