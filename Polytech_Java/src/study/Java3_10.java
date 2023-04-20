package study;

import java.util.Scanner;

public class Java3_10 {

	
	public static void main(String[] args) {
		// 12. 사칙 연산 계산 프로그램.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("연산>>");
        double x = sc.nextDouble();
        String operator = sc.next();
        double y = sc.nextDouble();
              
        // (1) if else문   
//        if (operator.equals("+"))                  //           if (x == (int)x)????
//           System.out.printf("%.1f+%.1f의 계산 결과는 %.1f", x,y,x+y);
//        else if (operator.equals("-"))
//           System.out.printf("%.1f-%.1f의 계산 결과는 %.1f", x,y,x-y);
//        else if (operator.equals("*"))
//           System.out.printf("%.1f*%.1f의 계산 결과는 %.1f", x,y,x*y);
//        else if (operator.equals("/"))
//           {if (y != 0)
//              System.out.printf("%.1f/%.1f의 계산 결과는 %.1f", x,y,x/y);
//           else
//              System.out.printf("0으로 나눌 수 없습니다.");
//           }
//        else
//           System.out.println("연산자가 +, -, *, /가 아닙니다.");
//        
    
        // (2) switch문
        switch (operator) {
           case "+":
              System.out.printf("%.1f+%.1f의 계산 결과는 %.1f", x,y,x+y);
              break;
           case "-":
              System.out.printf("%.1f-%.1f의 계산 결과는 %.1f", x,y,x-y);
              break;
           case "*":
              System.out.printf("%.1f*%.1f의 계산 결과는 %.1f", x,y,x*y);
              break;
           case "/":
              {if (y != 0)
                 System.out.printf("%.1f/%.1f의 계산 결과는 %.1f", x,y,x/y);
              else
                 System.out.printf("0으로 나눌 수 없습니다.");
              }   
              break;
           default:
              System.out.println("연산자가 +, -, *, /가 아닙니다.");
              break;
    }
	}

}
