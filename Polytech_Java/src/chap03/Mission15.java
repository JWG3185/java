package chap03;

public class Mission15 {

	public static void main(String[] args) {
		
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			//System.out.println("0���� ������ �����ϴ�.");
			e.printStackTrace();
		}
		
		
	}

}
