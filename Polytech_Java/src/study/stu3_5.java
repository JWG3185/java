package study;

import java.util.Scanner;

public class stu3_5 {

   public static void main(String[] args) {
      // ���� ���� 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ������ 3�� ����� ���.
      Scanner sc = new Scanner(System.in);
      
      System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
      //int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt(), a4 = sc.nextInt(),
         //   a5 = sc.nextInt(), a6 = sc.nextInt(), a7 = sc.nextInt(), a8 = sc.nextInt(),
            //      a9 = sc.nextInt(), a10 = sc.nextInt();
      int count = 10;
      int num[] = new int[count];
      
      for(int i = 0;i < count;i++) 
      {
         num[i] = sc.nextInt();
      }
      // �迭�� �����Ǿ����� ���
      for(int nu : num) 
      {
         System.out.print(nu + " ");
      }
      
      System.out.println();
      
      // 3�� ����� ���Ҹ� ���
      System.out.print("3�� ����� ");
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
