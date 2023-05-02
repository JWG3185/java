package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

//Scanner를 이용해서 한 하인을 읽고, 공백으로 분리된
//어절이 몇개 들어있는지, "그만"을 입력할 때까지 반복하는
//프로그램 작성

public class prac06_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
//		1)
		while(true) {
			System.out.print(">> ");
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			
			int count = 0;
			
			if(s.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			while(st.hasMoreTokens()) {
				st.nextToken();
				count++;
			}
			
			System.out.println("어절 개수 :" + count);
//			System.out.println("어절 개수 :" + st.countTokens());
			
		}
		
//		2)
//		while(true) {
//			System.out.print(">> ");
//			String s = sc.nextLine();
//			if(s.equals("그만")) {
//				System.out.println("종료합니다.");
//				break;
//			}
//			
//			String st[] = s.split(" ");
//			
//			System.out.println("어절 개수 :" + st.length);
//		}
		
	}

}
