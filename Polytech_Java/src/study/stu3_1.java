package study;

public class stu3_1 {

   public static void main(String[] args) {
     
      int sum = 0, i = 0;
      while(i<100) 
      {
         sum = sum + i;
         i += 2;
      }
      System.out.println(sum);
   }
}


// 1) ������ ��� �ϴ� �ڵ��̸� ���� ��� ��µǴ� ������?
// 0,2,4,6,...,96,98 ������ ¦������ ��, 2450


// 2) ���� �ڵ带 main() �޼ҵ�� ����� WhileTest Ŭ������ �ϼ��϶�.

//public class WhileTest{

//      public static void main(String[] args) {
         
//         int sum = 0, i = 0;
//         while(i<100) {
//            sum = sum + i;
//            i += 2;
//         }
//         System.out.println(sum);
//      }
//   }


// 3) for ���� �̿��Ͽ� �����ϰ� ����Ǵ� ForTest Ŭ������ �ۼ��϶�.

//public class ForTest {

//      public static void main(String[] args) {
         
//        int sum  = 0;
//         for(int i = 0; i <100; i = i + 2) {
//            sum = sum + i;   
//         }
//         System.out.println(sum);
//      }
//   }


// 4) do-while ���� �̿��Ϸ� �����ϰ� ����Ǵ� DoWhileTest Ŭ������ �ۼ��϶�.

//public class DoWhileTest {

//      public static void main(String[] args) {
         
//        int sum  = 0, i = 0;
//        do {
//            sum = sum + i;
//           i += 2;
//        }while(i<100);
//         System.out.println(sum);
//      }
//   }