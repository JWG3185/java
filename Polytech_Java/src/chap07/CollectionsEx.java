package chap07;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {

	public static void printList(LinkedList<String> ll) {
		Iterator<String> iterator = ll.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			
			if(iterator.hasNext()) separator = " ▶ ";
			else separator="\n";
			
			System.out.print(e + separator);
		}
	}
	
	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("트랜스포머");
		myList.add(0, "터미네이터");
		myList.add("아바타");
		myList.add("매트릭스");
		myList.add(2, "가디언즈오브갤럭시");
		
		printList(myList);
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		for (String string : myList) {
			System.out.println(Collections.binarySearch(myList, string));
		}
	}
//	트랜스포머 ▶ 터미네이터 ▶ 아바타 ▶ 매트릭스 ▶ 가디언즈오브갤럭시
//	트랜스포머(-6), 터미네이터(-6), 아바타(2), 매트릭스(-1), 가디언즈오브갤럭시(-1)
}
