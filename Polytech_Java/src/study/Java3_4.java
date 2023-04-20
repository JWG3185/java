package study;

import java.util.Scanner;

public class Java3_4 {

	public static void main(String[] args) {
		// 7. 2차원 평면의 (100, 100), (200, 200)의 직사각형, 점(x, y)가 이 직사각형 안에 있는지 판별. 
		// 정수 x, y
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x, y)의 좌표를 입력하시오>>");
		int x = sc.nextInt(), y = sc.nextInt(); 
		
		if ((x>=100 && x<=200) && (y>=100 && y<=200))
			System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다.");
		else
			System.out.println("(" + x + ", " + y + ")는 사각형 밖에 있습니다.");
		
		sc.close();
	}

}
