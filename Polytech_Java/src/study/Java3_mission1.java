package study;

public class Java3_mission1 {

	
	public static void main(String[] args) {
        
        for (int num = 1; num <= 99; num++) 
        {
	        int num10 	= num / 10;
			int num1 	= num % 10;
			
			if (num10 == 3 || num10 == 6 || num10 == 9)			// 십의 자리가 369가 포함된 경우
			{	
				if (num1 == 3 || num1 == 6 || num1 == 9)		// 일의 자리에 369가 포함된 경우
					System.out.println(num + " 박수 짝짝");
				else											// 십의 자리에만 369가 포함되고,
					System.out.println(num + " 박수 짝");			// 일의 자리에는 369가 포함 안된 경우
			}
			else												// 십의 자리에 369가 포함 안된 경우
			{
				if (num1 == 3 || num1 == 6 || num1 == 9)		// 일의 자리에만 369가 포함되고, 
					System.out.println(num + " 박수 짝");			// 십의 자리에는 369가 포함 안된 경우
			}
        }
        
	}
}
