package study;

import java.util.Scanner;

public class Java3_7 {

	
	public static void main(String[] args) {
		// 9. 점이 원의 내부에 있는지 판별
        Scanner sc = new Scanner(System.in);
        
        System.out.print("원의 중심과 반지름 입력>>");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r = sc.nextDouble();
        System.out.print("점 입력>>");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        if (((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)) <= r*r)
           System.out.printf("점 (%.1f , %.1f)는 원 안에 있다.", x2, y2);}

}
