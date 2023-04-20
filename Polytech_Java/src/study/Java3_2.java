package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Java3_2 {

	public static void main(String[] args) {
		// 5. Scanner클래스로 정수 3개를 입력받고 3개의 숫자로 삼각형을 만들수 있는지 판별.
		// 삼각형이 되려면 두 변의 합이 다른 한병의 합보다 커야함.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력하시오>>");
		int a = sc.nextInt(), b = sc.nextInt(), c =  sc.nextInt(); 
		
		// (1) 리스트로 오름차순 정렬해서 앞 2개와 끝 두개의 크기 비교 + 조건문 
//		ArrayList<Integer> mylist = new ArrayList<>(Arrays.asList(a,b,c));
//		mylist.sort(Comparator.naturalOrder());
//		
//		if ((mylist.get(0) + mylist.get(1))> mylist.get(2))
//			System.out.println("삼각형이 됩니다");
//		else
//			System.out.println("삼각형이 안됩니다");
		
		// (2) 조건문 사용
		if (a<b+c && b<a+c && c<a+b)				// 한 변의 길이가 다른 두변의 합보다 크거나 같으면 안됨.
			System.out.println("삼각형이 됩니다");
		else
			System.out.println("삼각형이 안됩니다");
		
		sc.close();
	}

}
