package study;

import java.util.Scanner;

public class Java3_5 {

	// �� (x, y)�� (rect1, recty1), (rectx2, recty2)�� �簢�� �ȿ� ������ true�� �����ϴ� �޼ҵ�.
	public static boolean inRect(double x, double y, double rectx1, double recty1,
												double rectx2, double recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
	
	public static boolean inRect2(double x, double y) {
		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
				return true;
		else return false;
	}
	
	
	public static void main(String[] args) {
		// 8. 2���� ����� (100, 100), (200, 200)�� ���簢��
		// ��(x1, y1), ��(x2, y2)���� �̷���� ���簢���� �浹�ϴ���? 

		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x1, y1), (x2, y2)�� �Է��Ͻÿ�>>");
		double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble(); 
		
		if (inRect2(x1,y1)||inRect2(x2,y2)||inRect2(x1,y2)||inRect2(x2,y1))			// ������ 4���� �Ѱ��� �簢�� �ȿ� �ִ� ���
			System.out.println("�浹�մϴ�.");
		else if (inRect2(x1,y1)&&inRect2(x2,y2)&&inRect2(x1,y2)&&inRect2(x2,y1))	// ������ 4���� ��� �簢�� �ȿ� �ִ� ���, �簢�� �ȿ� ���� ���
			System.out.println("�浹�մϴ�.");
		else if (inRect(100.0,100.0,x1 ,y1, x2, y2)&&inRect(200.0,200.0,x1 ,y1, x2, y2)
				&&inRect(100.0,200.0,x1 ,y1, x2, y2)&&inRect(200.0,100.0,x1 ,y1, x2, y2))	
																					//  �簢���� ���� ���
			System.out.println("�浹�մϴ�.");
		else
			System.out.println("�浹���� �ʽ��ϴ�.");
		
		sc.close();
	}

}
