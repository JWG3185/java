package study;

import java.util.Calendar;
import java.util.Scanner;

public class Java6_6 {
   
   private String name1;
   private String name2;
   private int second;
   
   //�̸� �ִ� ������ �޼ҵ�
   Java6_6(String n1, String n2){
      name1 = n1;
      name2 = n2;
   }

   //����ð� �̴� �޼ҵ�
   static int Cal() {
      Calendar cal = Calendar.getInstance();
      return cal.get(Calendar.SECOND); 
   }
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("�κ��� �̸��� <Enter>Ű�� �����Ͽ� �Է��� �ּ���>>");
      String a = sc.nextLine(); 
      String b = sc.nextLine();
      Java6_6 p6 = new Java6_6(a, b);
      
      int se1,se2,se3,se4;
      
      System.out.println();
      System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
      
      System.out.print(p6.name1 + " ���� <Enter>Ű >>");
      sc.nextLine();
      se1 = Cal();
      System.out.println("���� �� �ð� = " + se1);
      
      System.out.print("10�� ���� �� <Enter>Ű >>");
      sc.nextLine();
      se2 = Cal();
      System.out.println("���� �� �ð� = " + se2);

      System.out.print(p6.name2 + " ���� <Enter>Ű >>");
      sc.nextLine();
      se3 = Cal();
      System.out.println("���� �� �ð� = " + se3);
      
      System.out.print("10�� ���� �� <Enter>Ű >>");
      sc.nextLine();
      se4 = Cal();
      System.out.println("���� �� �ð� = " + se4);
      
      
      int p1 = se1 -se2; 
      int p2 = se3 -se4; 
      
      int term1;
      if(p1>0) {
         term1 = 60 - p1;
      }
      else {
         term1 = Math.abs(p1);
      }

      int term2;
      if(p2>0) {
         term2 = 60 - p2;
      }
      else {
         term2 = Math.abs(p2);
      }
      
      System.out.print(p6.name1 + "�� ��� " + term1 + ", " + p6.name2 + "�� ��� " + term2 + ", ");
      
      
      int pl1 = Math.abs(10 - term1);
      int pl2 = Math.abs(10 - term2);
      
      
      if(pl1 > pl2)
         System.out.println("���ڴ� " + p6.name2);
      else if(pl1 < pl2)
         System.out.println("���ڴ� " + p6.name1);
      else
         System.out.println("���º�");
      
      
      sc.close();
   }
   
}