package chap07;
//���� �ܾ� ���� �����

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("apple", "���");
		dic.put("lemon", "����");
		dic.put("banana", "�ٳ���");
		dic.put("orange", "������");
		dic.put("strawberry", "����");
		
		while (true) {
			System.out.print("ã����� �ܾ� >> ");
			String s = sc.next();
			
			if(s.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			if(dic.containsKey(s)) {
				System.out.println(dic.get(s));
			}
			else {
				System.out.println("�ٽ� �Է����ּ���");
			}
			
		}
		
	}
}
