package study;

public class stu3_2 {

	   public static void main(String[] args) {
	      // ���� 2���� �迭 n�� ����ϴ� ���α׷��� �ۼ��϶�.
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