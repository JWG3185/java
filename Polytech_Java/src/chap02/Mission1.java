package chap02;

public class Mission1 {

	public static void main(String[] args) {
		boolean result;				//Boolean : 레퍼런스 타입(앞부분 대문자)
		result = 3 == 5;
		System.out.println(result);
		System.out.println("===============");
		
		//자바는 왼쪽값과 오른쪽 값의 타입이 같길 원함.
		//int a = 3.5;	//자바에서 오류
		int a = (int) 3.5;	//빨간줄에 커서 올리면 캐스팅 해줌
		System.out.println(a);
		System.out.println("===============");
		
		//암호화, 복호화(XOR)
		int plain = 10;
		int key = 8;
		int cyper = plain ^ key;
		System.out.println("cyper = " + cyper);			//암호화
		System.out.println("plain = " + (cyper ^ key));	//복호화
		System.out.println("===============");
		
		//비트이동연산자
		System.out.println(10 >> 1);					// 1/2배
		System.out.println(10 << 1);					//2배
		System.out.println("===============");

		//var 키워드를 사용하여 변수 타입 생략
		var v = 30;
		System.out.println(v);
		System.out.println("===============");
		
		
		
		
		
		
		
	}
}
