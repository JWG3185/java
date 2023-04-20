package study;

import java.util.Scanner;

public class Java3_5 {

	// 점 (x, y)가 (rect1, recty1), (rectx2, recty2)의 사각형 안에 있으면 true를 리턴하는 메소드.
	public static boolean inRect(double x, double y, double rectx1, double recty1,
												double rectx2, double recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
	
	public static boolean inRect2(double x, double y) {
		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
				return true;
		else return false;
	}
	
	
	public static void main(String[] args) {
		// 8. 2차원 평면의 (100, 100), (200, 200)의 직사각형
		// 점(x1, y1), 점(x2, y2)으로 이루어진 직사각형과 충돌하는지? 

		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x1, y1), (x2, y2)를 입력하시오>>");
		double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble(); 
		
		if (inRect2(x1,y1)||inRect2(x2,y2)||inRect2(x1,y2)||inRect2(x2,y1))			// 꼭짓점 4개가 한개라도 사각형 안에 있는 경우
			System.out.println("충돌합니다.");
		else if (inRect2(x1,y1)&&inRect2(x2,y2)&&inRect2(x1,y2)&&inRect2(x2,y1))	// 꼭짓점 4개가 모두 사각형 안에 있는 경우, 사각형 안에 들어가는 경우
			System.out.println("충돌합니다.");
		else if (inRect(100.0,100.0,x1 ,y1, x2, y2)&&inRect(200.0,200.0,x1 ,y1, x2, y2)
				&&inRect(100.0,200.0,x1 ,y1, x2, y2)&&inRect(200.0,100.0,x1 ,y1, x2, y2))	
																					//  사각형을 덮는 경우
			System.out.println("충돌합니다.");
		else
			System.out.println("충돌하지 않습니다.");
		
		sc.close();
	}

}
