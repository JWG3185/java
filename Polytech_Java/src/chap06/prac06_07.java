package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

//Scanner�� �̿��ؼ� �� ������ �а�, �������� �и���
//������ � ����ִ���, "�׸�"�� �Է��� ������ �ݺ��ϴ�
//���α׷� �ۼ�

public class prac06_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
//		1)
		while(true) {
			System.out.print(">> ");
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			
			int count = 0;
			
			if(s.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			while(st.hasMoreTokens()) {
				st.nextToken();
				count++;
			}
			
			System.out.println("���� ���� :" + count);
//			System.out.println("���� ���� :" + st.countTokens());
			
		}
		
//		2)
//		while(true) {
//			System.out.print(">> ");
//			String s = sc.nextLine();
//			if(s.equals("�׸�")) {
//				System.out.println("�����մϴ�.");
//				break;
//			}
//			
//			String st[] = s.split(" ");
//			
//			System.out.println("���� ���� :" + st.length);
//		}
		
	}

}
