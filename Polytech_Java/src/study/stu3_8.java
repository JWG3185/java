package study;

import java.util.Random;
import java.util.Scanner;

public class stu3_8 {

   public static void main(String[] args) {
      // ������ � �������� Ű����� �Է� �޾� (100���� ���� ����)
      // ���� �迭 ����, 1 ~ 100�� ���� �� ����
      // �迭�� ���� ���� �����϶�.
      
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.print("���� �?");
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