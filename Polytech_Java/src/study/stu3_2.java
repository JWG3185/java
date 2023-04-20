package study;

public class stu3_2 {

	   public static void main(String[] args) {
	      // 다음 2차원 배열 n을 출력하는 프로그램을 작성하라.
	      int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
	      
	      for(int x[] : n) 
	      {
	         for(int y : x) 
	         {
	         System.out.printf("%-2d",y);
	         }
	         System.out.println();
	      }
	   }
	}