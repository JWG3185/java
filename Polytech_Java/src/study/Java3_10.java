package study;

import java.util.Scanner;

public class Java3_10 {

	
	public static void main(String[] args) {
		// 12. ��Ģ ���� ��� ���α׷�.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("����>>");
        double x = sc.nextDouble();
        String operator = sc.next();
        double y = sc.nextDouble();
              
        // (1) if else��   
//        if (operator.equals("+"))                  //           if (x == (int)x)????
//           System.out.printf("%.1f+%.1f�� ��� ����� %.1f", x,y,x+y);
//        else if (operator.equals("-"))
//           System.out.printf("%.1f-%.1f�� ��� ����� %.1f", x,y,x-y);
//        else if (operator.equals("*"))
//           System.out.printf("%.1f*%.1f�� ��� ����� %.1f", x,y,x*y);
//        else if (operator.equals("/"))
//           {if (y != 0)
//              System.out.printf("%.1f/%.1f�� ��� ����� %.1f", x,y,x/y);
//           else
//              System.out.printf("0���� ���� �� �����ϴ�.");
//           }
//        else
//           System.out.println("�����ڰ� +, -, *, /�� �ƴմϴ�.");
//        
    
        // (2) switch��
        switch (operator) {
           case "+":
              System.out.printf("%.1f+%.1f�� ��� ����� %.1f", x,y,x+y);
              break;
           case "-":
              System.out.printf("%.1f-%.1f�� ��� ����� %.1f", x,y,x-y);
              break;
           case "*":
              System.out.printf("%.1f*%.1f�� ��� ����� %.1f", x,y,x*y);
              break;
           case "/":
              {if (y != 0)
                 System.out.printf("%.1f/%.1f�� ��� ����� %.1f", x,y,x/y);
              else
                 System.out.printf("0���� ���� �� �����ϴ�.");
              }   
              break;
           default:
              System.out.println("�����ڰ� +, -, *, /�� �ƴմϴ�.");
              break;
    }
	}

}
