package study;

import java.util.Calendar;
import java.util.Scanner;

public class Java6_6 {
   
   private String name1;
   private String name2;
   private int second;
   
   //이름 넣는 생성자 메소드
   Java6_6(String n1, String n2){
      name1 = n1;
      name2 = n2;
   }

   //현재시간 뽑는 메소드
   static int Cal() {
      Calendar cal = Calendar.getInstance();
      return cal.get(Calendar.SECOND); 
   }
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("두분의 이름을 <Enter>키로 구분하여 입력해 주세요>>");
      String a = sc.nextLine(); 
      String b = sc.nextLine();
      Java6_6 p6 = new Java6_6(a, b);
      
      int se1,se2,se3,se4;
      
      System.out.println();
      System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
      
      System.out.print(p6.name1 + " 시작 <Enter>키 >>");
      sc.nextLine();
      se1 = Cal();
      System.out.println("현재 초 시간 = " + se1);
      
      System.out.print("10초 예상 후 <Enter>키 >>");
      sc.nextLine();
      se2 = Cal();
      System.out.println("현재 초 시간 = " + se2);

      System.out.print(p6.name2 + " 시작 <Enter>키 >>");
      sc.nextLine();
      se3 = Cal();
      System.out.println("현재 초 시간 = " + se3);
      
      System.out.print("10초 예상 후 <Enter>키 >>");
      sc.nextLine();
      se4 = Cal();
      System.out.println("현재 초 시간 = " + se4);
      
      
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
      
      System.out.print(p6.name1 + "의 결과 " + term1 + ", " + p6.name2 + "의 결과 " + term2 + ", ");
      
      
      int pl1 = Math.abs(10 - term1);
      int pl2 = Math.abs(10 - term2);
      
      
      if(pl1 > pl2)
         System.out.println("승자는 " + p6.name2);
      else if(pl1 < pl2)
         System.out.println("승자는 " + p6.name1);
      else
         System.out.println("무승부");
      
      
      sc.close();
   }
   
}