package study;

import java.util.Scanner;

public class Java3_9 {

	
	public static void main(String[] args) {
		// 10. �� ���� ��ġ���� �Ǻ�
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        
        if ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) >= (r1+r2)*(r1+r2))
           System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
        else
           System.out.println("�� ���� ���� ��ģ��.");
	}

}
