package study;

import java.util.Random;

public class stu3_7 {

   public static void main(String[] args) {
      // ���� 10�� �����ϴ� �迭, 1 ~ 10������ ������ ������ ���� ����
      // ������ ��� ���.
      int A[] = new int[10];
      
      Random rand = new Random();
      
      for(int i = 0; i < 10;i++)
      {
         A[i] =  1 + rand.nextInt(10);
      }
      // �迭 ���
      System.out.print("������ ������ : ");
      for(int a : A) 
      {
         System.out.print(a + " ");
      }
      System.out.println();
      // ��� ���ϱ�
      int sum = 0;
      
      for(int i = 0; i < 10;i++) 
      {
         sum = sum + A[i];
      }
      System.out.print("����� " + sum/10.0);
      
   }

}
