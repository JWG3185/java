package chap06;

public class WrapperEx {
	
	public static void main(String[] args) {

//		Integer i = new Integer(10);	//박싱
		Integer i = 10;					//오토박싱
		Integer i1 = new Integer("10");	//오버로딩
//		Integer i1 = "10";				//이건 안됨
		
		System.out.println(i);
		System.out.println(i1);
		System.out.println();
		
		char c1 = '4';
		char c2 = 'A';
		if(Character.isDigit(c1)) {
			System.out.println("c1은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println("c2은 알파벳");
		}
		
	}
}
