package study;

import java.util.Random;

public class stu3_7 {

   public static void main(String[] args) {
      // 정수 10개 저장하는 배열, 1 ~ 10까지의 범위의 랜덤한 수를 저장
      // 숫자의 평균 출력.
      int A[] = new int[10];
      
      Random rand = new Random();
      
      for(int i = 0; i < 10;i++)
      {
         A[i] =  1 + rand.nextInt(10);
      }
      // 배열 출력
      System.out.print("랜덤한 정수들 : ");
      for(int a : A) 
      {
         System.out.print(a + " ");
      }
      System.out.println();
      // 평균 구하기
      int sum = 0;
      
      for(int i = 0; i < 10;i++) 
      {
         sum = sum + A[i];
      }
      System.out.print("평균은 " + sum/10.0);
      
   }

}
