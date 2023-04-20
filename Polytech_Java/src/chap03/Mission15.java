package chap03;

public class Mission15 {

	public static void main(String[] args) {
		
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			//System.out.println("0으로 나눌수 없습니다.");
			e.printStackTrace();
		}
		
		
	}

}
