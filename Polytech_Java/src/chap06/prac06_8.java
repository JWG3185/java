package chap06;

import java.util.Scanner;

//���ڿ��� �Է¹޾� �ѱ��ھ� ȸ������ ��� ����ϴ� ���α׷��� �ۼ��϶�.

public class prac06_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
			String s = sc.nextLine();
			
			for(int i=0; i < s.length() ; i++) 
			{
				System.out.println(s.substring(1)+s.charAt(0));
				s = s.substring(1)+s.charAt(0);
			}
			sc.close();
			System.out.println("d".repeat(10));
			
			
	}
		
}

