package chap02;

// switch �� Ȱ��
// ����ڷκ��� month �� ������ �Է¹޾Ƽ�
// month�� days�� ������ּ���.
// month : 2 - 28��, 4,5,9,11 - 30��, ��Ÿ - 31��

import java.util.Scanner;

public class Mission9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���.(1~12) >> ");
		int month = sc.nextInt();
		
		int days = 0;
		
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		
		System.out.println(month + "���� " + days + "���Դϴ�.");
		sc.close();
	}

}
