package study;

import java.util.Scanner;

public class stu3_3 {

   public static void main(String[] args) {
      // Scanner�� �̿��Ͽ� ������ �Է� �ް� *�� ����ϴ� ���α׷� �ۼ�
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("������ �Է��Ͻÿ�.>>");
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