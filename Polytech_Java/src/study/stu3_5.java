package study;

import java.util.Scanner;

public class stu3_5 {

   public static void main(String[] args) {
      // 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수중 3의 배수만 출력.
      Scanner sc = new Scanner(System.in);
      
      System.out.print("양의 정수 10개를 입력하시오>>");
      //int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt(), a4 = sc.nextInt(),
         //   a5 = sc.nextInt(), a6 = sc.nextInt(), a7 = sc.nextInt(), a8 = sc.nextInt(),
            //      a9 = sc.nextInt(), a10 = sc.nextInt();
      int count = 10;
      int num[] = new int[count];
      
      for(int i = 0;i < count;i++) 
      {
         num[i] = sc.nextInt();
      }
      // 배열에 저정되었는지 출력
      for(int nu : num) 
      {
         System.out.print(nu + " ");
      }
      
      System.out.println();
      
      // 3의 배수인 원소만 출력
      System.out.print("3의 배수는 ");
      for(int nu : num) 
      {
         if(nu % 3==0)
         {
            System.out.print(nu + " ");   
         }
      }
      sc.close();
   }
}
