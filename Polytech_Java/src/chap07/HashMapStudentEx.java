package chap07;

import java.util.HashMap;
import java.util.Scanner;

class Studenth {
	
	private int id;
	private String tel;
	
	public Studenth(int id, String tel) {
		super();
		this.id = id;
		this.tel = tel;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "아이디: " + id + ", 전화: " + tel ;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {

		HashMap<String, Studenth> map = new HashMap<String, Studenth>();
		
		map.put("엄남경", new Studenth(1, "010-000-0000"));
		map.put("정웅기", new Studenth(2, "010-111-1111"));
		map.put("최지현", new Studenth(3, "010-222-2222"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름? >> ");
			String name = sc.nextLine();
			
			if(name.equals("그만")) break;
			
			System.out.println(map.get(name));
		}
		
		sc.close();
		
	}

}
