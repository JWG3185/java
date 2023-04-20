package study;

import java.util.Scanner;

public class stu3_6 {

   public static void main(String[] args) {
      // 배열과 반복문 이용
      // 키보드에서 정수로 된 돈의 액수 입력받아서 변환.
   
      int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
      
      Scanner sc = new Scanner(System.in);
   
      System.out.print("금액을 입력하시오>>");
      int won = sc.nextInt();
      
      for(int num : unit) 
      {
         int check = 0;
         check = won / num; 
         won = won % num;
         if (check==0) 
         {
            continue;
         }
         else 
         {
            System.out.println(num + "원 짜리 : " + check + "개");   
         }
      }
      sc.close();
   }
}