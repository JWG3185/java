package chap07;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

class Nation {
	
	private String cty;
	private String cap;
	
	Nation(String c1, String c2){
		this.cty = c1;
		this.cap = c2;
	}
	
	public String getCty() {
		return cty;
	}
	public void setCty(String cty) {
		this.cty = cty;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	
}

public class prac07_11 {
	
	public static void main(String[] args) {
		
		Random random  = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		//(1) Vector
		
		Vector<Nation> all = new Vector<Nation>();
		all.add(new Nation("�ѱ�",  "����") );
		
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		
		while(true) {
		
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			String sel1 = sc.next();
			sc.nextLine();
			
			if(sel1.equals("1") ) {
			
				System.out.println("���� " + all.size() + "���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				
				while(true) {
					System.out.print("����� ���� �Է�" + (all.size()+1) + ">>");
					String sel2 = sc.nextLine();
					if(sel2.equals("�׸�") ) break;
					
					StringTokenizer st = new StringTokenizer(sel2, " ");
					String a = st.nextToken();
					String b = st.nextToken();
					
					int count = 0;
					for (Nation nation : all) {
						if (nation.getCty().equals(a) ) {
							System.out.println(nation.getCty() + "��(��) �̹� �ֽ��ϴ�!!");
							break;
						}
						count++;
					}
					
					if(count == all.size()) {
						all.add(new Nation(a, b));
					}
					
				}
			}
			
			else if(sel1.equals("2")) {
				if(all.size()==0) {
					System.out.println("����� ������ ä���ּ���.");
					continue;
				}
				
				while(true) {
					int r  = random.nextInt(all.size());
					System.out.print(all.get(r).getCty() + "�� ������? ");
					String sel3 = sc.nextLine();
					
					if(sel3.equals("�׸�") ) break;
					
					else {
						if(sel3.equals(all.get(r).getCap() ) ) {
							System.out.println("����!!");
						}
						else {
							System.out.println("�ƴմϴ�!!");
						}
					}
				}
			}
			
			else {
				System.out.println("������ �����մϴ�.");
				break;
			}
			
		}
		
		//(2) HashMap
		
		HashMap<String,String> all2 = new HashMap<String, String>();
		all2.put("�ѱ�",  "����");
		
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		
		while(true) {
		
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			String sel1 = sc.next();
			sc.nextLine();
			
			if(sel1.equals("1") ) {
			
				System.out.println("���� " + all2.size() + "���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				
				while(true) {
					System.out.print("����� ���� �Է�" + (all2.size()+1) + ">>");
					String sel2 = sc.nextLine();
					if(sel2.equals("�׸�") ) break;
					
					StringTokenizer st = new StringTokenizer(sel2, " ");
					String a = st.nextToken();
					String b = st.nextToken();
				
					if(all2.containsKey(a)) {
						System.out.println(a + "��(��) �̹� �ֽ��ϴ�!!");
					}
					else {
						all2.put(a, b);
					}
					
				}
			}
			
			else if(sel1.equals("2")) {
				if(all2.size()==0) {
					System.out.println("����� ������ ä���ּ���.");
					continue;
				}
				
				while(true) {
					int r  = random.nextInt(all2.size());
					System.out.print( all2.keySet().toArray()[r] + "�� ������? ");
					String sel3 = sc.nextLine();
					
					if(sel3.equals("�׸�") ) break;
					
					else {
						if(sel3.equals(all2.get(all2.keySet().toArray()[r]) ) ) {
							System.out.println("����!!");
						}
						else {
							System.out.println("�ƴմϴ�!!");
						}
					}
				}
			}
			
			else {
				System.out.println("������ �����մϴ�.");
				break;
			}
			
		}
	
		sc.close();
	}
}
