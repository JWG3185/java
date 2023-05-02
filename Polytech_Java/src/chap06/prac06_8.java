package chap06;

import java.util.Scanner;

//문자열을 입력받아 한글자씩 회전시켜 모두 출력하는 프로그램을 작성하라.

public class prac06_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
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

