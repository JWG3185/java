package study;

import java.util.Scanner;

public class Java3_4 {

	public static void main(String[] args) {
		// 7. 2���� ����� (100, 100), (200, 200)�� ���簢��, ��(x, y)�� �� ���簢�� �ȿ� �ִ��� �Ǻ�. 
		// ���� x, y
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x, y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = sc.nextInt(), y = sc.nextInt(); 
		
		if ((x>=100 && x<=200) && (y>=100 && y<=200))
			System.out.println("(" + x + ", " + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		else
			System.out.println("(" + x + ", " + y + ")�� �簢�� �ۿ� �ֽ��ϴ�.");
		
		sc.close();
	}

}
