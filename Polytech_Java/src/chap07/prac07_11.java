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
		all.add(new Nation("한국",  "서울") );
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		
		while(true) {
		
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			String sel1 = sc.next();
			sc.nextLine();
			
			if(sel1.equals("1") ) {
			
				System.out.println("현재 " + all.size() + "개의 나라와 수도가 입력되어 있습니다.");
				
				while(true) {
					System.out.print("나라와 수도 입력" + (all.size()+1) + ">>");
					String sel2 = sc.nextLine();
					if(sel2.equals("그만") ) break;
					
					StringTokenizer st = new StringTokenizer(sel2, " ");
					String a = st.nextToken();
					String b = st.nextToken();
					
					int count = 0;
					for (Nation nation : all) {
						if (nation.getCty().equals(a) ) {
							System.out.println(nation.getCty() + "은(는) 이미 있습니다!!");
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
					System.out.println("나라와 수도를 채워주세요.");
					continue;
				}
				
				while(true) {
					int r  = random.nextInt(all.size());
					System.out.print(all.get(r).getCty() + "의 수도는? ");
					String sel3 = sc.nextLine();
					
					if(sel3.equals("그만") ) break;
					
					else {
						if(sel3.equals(all.get(r).getCap() ) ) {
							System.out.println("정답!!");
						}
						else {
							System.out.println("아닙니다!!");
						}
					}
				}
			}
			
			else {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}
		
		//(2) HashMap
		
		HashMap<String,String> all2 = new HashMap<String, String>();
		all2.put("한국",  "서울");
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		
		while(true) {
		
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			String sel1 = sc.next();
			sc.nextLine();
			
			if(sel1.equals("1") ) {
			
				System.out.println("현재 " + all2.size() + "개의 나라와 수도가 입력되어 있습니다.");
				
				while(true) {
					System.out.print("나라와 수도 입력" + (all2.size()+1) + ">>");
					String sel2 = sc.nextLine();
					if(sel2.equals("그만") ) break;
					
					StringTokenizer st = new StringTokenizer(sel2, " ");
					String a = st.nextToken();
					String b = st.nextToken();
				
					if(all2.containsKey(a)) {
						System.out.println(a + "은(는) 이미 있습니다!!");
					}
					else {
						all2.put(a, b);
					}
					
				}
			}
			
			else if(sel1.equals("2")) {
				if(all2.size()==0) {
					System.out.println("나라와 수도를 채워주세요.");
					continue;
				}
				
				while(true) {
					int r  = random.nextInt(all2.size());
					System.out.print( all2.keySet().toArray()[r] + "의 수도는? ");
					String sel3 = sc.nextLine();
					
					if(sel3.equals("그만") ) break;
					
					else {
						if(sel3.equals(all2.get(all2.keySet().toArray()[r]) ) ) {
							System.out.println("정답!!");
						}
						else {
							System.out.println("아닙니다!!");
						}
					}
				}
			}
			
			else {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}
	
		sc.close();
	}
}
