package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력해주세요>> ");
			a.add(sc.next());
		}
		
		for (String name : a) {
			System.out.print(name + " ");
		}
		
		int longestIndex = 0;
		
		for(int i = 1; i < a.size(); i++) {
			if(a.get(i).length() > a.get(longestIndex).length()) {
				longestIndex = i;
			}
		}
		System.out.println();
		System.out.println("가장 긴 이름 : " + a.get(longestIndex));
		
	}
}
