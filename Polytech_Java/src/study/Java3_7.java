package study;

import java.util.Scanner;

public class Java3_7 {

	
	public static void main(String[] args) {
		// 9. ���� ���� ���ο� �ִ��� �Ǻ�
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���� �߽ɰ� ������ �Է�>>");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r = sc.nextDouble();
        System.out.print("�� �Է�>>");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        if (((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)) <= r*r)
           System.out.printf("�� (%.1f , %.1f)�� �� �ȿ� �ִ�.", x2, y2);}

}
