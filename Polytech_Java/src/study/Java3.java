package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		// 4. Scanner클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
		// 평균값을 구하는 것이 아님에 주의
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = sc.nextInt(), b = sc.nextInt(), c =  sc.nextInt(); 
		
		// (1)리스트 안에 a, b, c 넣고 오름차순 정렬하고 두번째 값 뽑기
//		ArrayList<Integer> mylist = new ArrayList<>(Arrays.asList(a,b,c));
//		mylist.sort(Comparator.naturalOrder());
//		System.out.println(mylist);
//		System.out.println(mylist.get(1));
		
		// (2) 조건문 쓰기
		if (a>=b && a<=c)				// a가 중간에 껴있고, 크기순이 b a c인 경우
			System.out.println(a);
		else if (a>=c && a<=b)			// a가 중간에 껴있고, 크기순이 c a b인 경우
			System.out.println(a);
		else if (b>=a && b<=c)			// b가 중간에 껴있고, 크기순이 a b c인 경우
			System.out.println(b);
		else if (b>=c && b<=a)			// b가 중간에 껴있고, 크기순이 c b a인 경우
			System.out.println(b);
		else if (c>=a && c<=b)			// c가 중간에 껴있고, 크기순이 a c b인 경우
			System.out.println(c);
		else 							// c가 중간에 껴있고, 크기순이 b c a인 경우
			System.out.println(c);
		
		sc.close();
	}

}
