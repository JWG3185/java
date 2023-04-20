package study;

import java.util.Random;
import java.util.Scanner;

public class stu3_8 {

   public static void main(String[] args) {
      // 정수를 몇개 저장할지 키보드로 입력 받아 (100보다 작은 개수)
      // 정수 배열 생성, 1 ~ 100의 랜덤 수 삽입
      // 배열에 같은 수는 없게하라.
      
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.print("정수 몇개?");
      int num = sc.nextInt();
      
      int A[] = new int[num];
      
      for(int i = 0; i < num;i++) 
      {
         A[i] =  1 + rand.nextInt(100);
         for(int j=0; j<i; j++)
         {
            if(A[i]==A[j]) 
            {
               i--;
            }
         }
      }
      int count = 0;
      for(int x : A) 
      {
         count++;
         System.out.printf("%3d", x);
         if(count % 10==0) 
         {
            System.out.println();
         }
      }
      sc.close();
   }
}