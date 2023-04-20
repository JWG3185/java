package study;

import java.util.Scanner;

public class Java3_9 {

	
	public static void main(String[] args) {
		// 10. 두 원이 겹치는지 판별
        Scanner sc = new Scanner(System.in);
        
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        
        if ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) >= (r1+r2)*(r1+r2))
           System.out.println("두 원은 서로 겹치지 않는다.");
        else
           System.out.println("두 원은 서로 겹친다.");
	}

}
