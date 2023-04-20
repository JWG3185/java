package study;

import java.util.Scanner;

public class stu3_3 {

   public static void main(String[] args) {
      // Scanner를 이용하여 정수를 입력 받고 *을 출력하는 프로그램 작성
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("정수를 입력하시오.>>");
      int num  = sc.nextInt();
      
      for (int i = 0; i < num; i++) 
      {
         for (int j = 0; j < num - i; j++) 
         {
            System.out.print("*");
         }
         System.out.println();
      }
      sc.close();
   }

}