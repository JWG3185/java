package chap07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;


public class prac07_5_2 {
	
	public static void main(String[] args) {

		HashMap<String, Studentin> h = new HashMap<String, Studentin>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		
		
		for(int i = 0; i < 4; i++) {
			System.out.print(">>");
			String msg = sc.nextLine();
			StringTokenizer st = new StringTokenizer(msg, ",");
			String name = st.nextToken().trim();
			h.put(name, new Studentin(
					name,
					st.nextToken().trim(),
					Integer.parseInt(st.nextToken().trim() ),
					Double.parseDouble(st.nextToken().trim() ) 
					) 
					);
		}
		
		
		System.out.println("-".repeat(30));
		
		
		//toString()
		for (String st : h.keySet()) {
			System.out.println(h.get(st));
			System.out.println("-".repeat(30));
		}
		
		
		System.out.println("-".repeat(30));
		
		
		//�ٸ� ���
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(h.get(it.next() ) );
			System.out.println("-".repeat(30));
		}
		
		
		
		//get()
//		for (Studentin st : a) {
//			System.out.println("�̸� : " + st.getName());
//			System.out.println("�а� : " + st.getDept());
//			System.out.println("�й� : " + st.getId());
//			System.out.println("������� : " + st.getScore());
//		}
		
		//�������
//		while (true) {
//			System.out.print("�л� �̸� >> ");
//			String as  = sc.next().trim();
//			
//			if(as.equals("�׸�")) {
//				System.out.println("����...");
//				break;
//			}
//			
//			for (String st : h.keySet()) {
//				if(st.getName().equals(as)) {
//					System.out.println(st.getName() + ", " + st.getDept() + ", " + st.getId() + ", " + st.getScore());
//				}
//			}
//		}
//		
//		
//		//Iterator ���
//		Iterator<Studentin> it = a.iterator();
//		while (it.hasNext()) {
//			System.out.print("�л� �̸� >> ");
//			String as  = sc.next().trim();
//			Studentin sss = it.next();
//				if(sss.getName().equals(as)) {
//					System.out.println(sss.getName() + ", " + sss.getDept() + ", " + sss.getId() + ", " + sss.getScore());
//				}
//			
//		}
		
		sc.close();
		
	}

}
