package study;

import java.util.Scanner;

public class stu3_6 {

   public static void main(String[] args) {
      // �迭�� �ݺ��� �̿�
      // Ű���忡�� ������ �� ���� �׼� �Է¹޾Ƽ� ��ȯ.
   
      int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
      
      Scanner sc = new Scanner(System.in);
   
      System.out.print("�ݾ��� �Է��Ͻÿ�>>");
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
            System.out.println(num + "�� ¥�� : " + check + "��");   
         }
      }
      sc.close();
   }
}