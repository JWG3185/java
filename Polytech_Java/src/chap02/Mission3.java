package chap02;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ȭ �Է� (���� ��) >> ");
		int won = scan.nextInt();
		System.out.println(won + "���� $" + won/1100.0 + " �Դϴ�.");
		// ĳ���� ����ϸ� won/1100.0 -> (double)won/1100
		
		scan.close();
	}

}
