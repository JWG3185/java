package study;

import java.util.Scanner;

public class stu3_4 {

   public static void main(String[] args) {
      // Scanner 이용하여 소문자 알파벳하나 입력받고, 다음과 같이 출력하는 프로그램 작성.
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("소문자 알파벳 하나를 입력하시오>>");
      String Alpa = sc.next();
      char alpa = Alpa.charAt(0);
      
      for(char i = 'a'; i <= alpa; i++) 
      {
         for(char j = 'a'; j <= 'a' + alpa - i; j++) 
         {
            System.out.print(j);   
         }
         System.out.println();
      }
      sc.close();
   }

}