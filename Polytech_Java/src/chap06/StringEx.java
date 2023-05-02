package chap06;

public class StringEx {
	
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a.length());
		
		System.out.println(a.contains("#"));			//문자를 포함하는지 true, false로 출력
		
		System.out.println(a.concat(b));				//문자열 연결
		
		System.out.println(a.trim());					//문자열 양쪽 공백제거
		
		System.out.println();
		
		
		String c = a.concat(b);
		System.out.println(c);
		
		System.out.println(c.replace("C#", "JAVA"));	// C# 문자열을 JAVA로 변경
		
		
		String s[] = c.split(",");						// , 를 구분자로 나눔
		
		for (String string : s) {
			System.out.println(string);
		}
		
		String sub = c.substring(4);					//4번 인덱스부터 문자열 저장
		System.out.println(sub);
		
		System.out.println(c.charAt(3));				//3번 인덱스의 문자 출력
		
	}
}
