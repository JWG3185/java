package chap07;
//영어 단어 사전 만들기

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("apple", "사과");
		dic.put("lemon", "레몬");
		dic.put("banana", "바나나");
		dic.put("orange", "오렌지");
		dic.put("strawberry", "딸기");
		
		while (true) {
			System.out.print("찾고싶은 단어 >> ");
			String s = sc.next();
			
			if(s.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			if(dic.containsKey(s)) {
				System.out.println(dic.get(s));
			}
			else {
				System.out.println("다시 입력해주세요");
			}
			
		}
		
	}
}
