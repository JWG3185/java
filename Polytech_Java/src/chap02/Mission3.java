package chap02;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원화 입력 (단위 원) >> ");
		int won = scan.nextInt();
		System.out.println(won + "원은 $" + won/1100.0 + " 입니다.");
		// 캐스팅 사용하면 won/1100.0 -> (double)won/1100
		
		scan.close();
	}

}
