package chap02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		// 증감연산자 (후위, 전위)
//		int a = 10, b = 20, c = 30, d = 40;
//		c = ++a - b-- + d--;
//		
//		System.out.println(a);//11
//		System.out.println(c);//31
//		System.out.println(b);//19
//		System.out.println(d);//39
		
		// 노가다
		Scanner sc = new Scanner(System.in);
		System.out.print("급액을 입력하시오 >> ");
		int won = sc.nextInt();
		int 오만원 = won/50000;
		int 오만원나머지 = won%50000;
		int 만원 = 오만원나머지/10000;
		int 만원나머지 = 오만원나머지%10000;
		int 천원 = 만원나머지/1000;
		int 천원나머지 = 만원나머지%1000;
		int 백원 = 천원나머지/100;
		int 백원나머지 = 천원나머지%100;
		int 오십원 = 백원나머지/50;
		int 오십원나머지 = 백원나머지%50;
		int 십원 = 오십원나머지/10;
		int 일원 = 오십원나머지%10;
		
		System.out.println("오만원권 : " + 오만원 + "매");
		System.out.println("만원권 : " + 만원 + "매");
		System.out.println("천원권 : " + 천원 + "매");
		System.out.println("백원권 : " + 백원 + "매");
		System.out.println("오십원권 : " + 오십원 + "매");
		System.out.println("십원권 : " + 십원 + "매");
		System.out.println("일원권 : " + 일원 + "매");
		
		sc.close();
	}

}
