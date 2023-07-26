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
		return "���̵�: " + id + ", ��ȭ: " + tel ;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {

		HashMap<String, Studenth> map = new HashMap<String, Studenth>();
		
		map.put("������", new Studenth(1, "010-000-0000"));
		map.put("������", new Studenth(2, "010-111-1111"));
		map.put("������", new Studenth(3, "010-222-2222"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�˻��� �̸�? >> ");
			String name = sc.nextLine();
			
			if(name.equals("�׸�")) break;
			
			System.out.println(map.get(name));
		}
		
		sc.close();
		
	}

}
