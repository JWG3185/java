package study;

public class Java3_mission1 {

	
	public static void main(String[] args) {
        
        for (int num = 1; num <= 99; num++) 
        {
	        int num10 	= num / 10;
			int num1 	= num % 10;
			
			if (num10 == 3 || num10 == 6 || num10 == 9)			// ���� �ڸ��� 369�� ���Ե� ���
			{	
				if (num1 == 3 || num1 == 6 || num1 == 9)		// ���� �ڸ��� 369�� ���Ե� ���
					System.out.println(num + " �ڼ� ¦¦");
				else											// ���� �ڸ����� 369�� ���Եǰ�,
					System.out.println(num + " �ڼ� ¦");			// ���� �ڸ����� 369�� ���� �ȵ� ���
			}
			else												// ���� �ڸ��� 369�� ���� �ȵ� ���
			{
				if (num1 == 3 || num1 == 6 || num1 == 9)		// ���� �ڸ����� 369�� ���Եǰ�, 
					System.out.println(num + " �ڼ� ¦");			// ���� �ڸ����� 369�� ���� �ȵ� ���
			}
        }
        
	}
}
