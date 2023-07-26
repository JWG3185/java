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
			
			if(iterator.hasNext()) separator = " �� ";
			else separator="\n";
			
			System.out.print(e + separator);
		}
	}
	
	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Ʈ��������");
		myList.add(0, "�͹̳�����");
		myList.add("�ƹ�Ÿ");
		myList.add("��Ʈ����");
		myList.add(2, "���������갶����");
		
		printList(myList);
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		for (String string : myList) {
			System.out.println(Collections.binarySearch(myList, string));
		}
	}
//	Ʈ�������� �� �͹̳����� �� �ƹ�Ÿ �� ��Ʈ���� �� ���������갶����
//	Ʈ��������(-6), �͹̳�����(-6), �ƹ�Ÿ(2), ��Ʈ����(-1), ���������갶����(-1)
}
