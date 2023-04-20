package study;

import java.util.Scanner;

public class Java3_8 {

	
	public static void main(String[] args) {
		// 11. 계절 판별.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("달을 입력하세요(1~12)>>");
        int month = sc.nextInt();
        
        // (1) if else문
//        if (month == 3 || month == 4 || month == 5)
//           System.out.println("봄");
//        else if (month == 6 || month == 7 || month == 8)
//           System.out.println("여름");
//        else if (month == 9 || month == 10 || month == 11)
//           System.out.println("가을");
//        else if (month == 12 || month == 1 || month == 2)
//           System.out.println("겨울");
//        else
//           System.out.println("잘못입력");
//        
        // (2) switch문
        switch (month) {
      case 3: 
      case 4:
      case 5:
         System.out.println("봄");
         break;
      case 6: 
      case 7:
      case 8:
         System.out.println("여름");
         break;
      case 9: 
      case 10:
      case 11:
         System.out.println("가을");
         break;
      case 12: 
      case 1:
      case 2:
         System.out.println("겨울");
         break;
      default:
         System.out.println("잘못입력");
         break;
      }
	}

}
