package chap07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

class Studentin {
	private String name;
	private String dept;
	private int id;
	private double score;
	
	Studentin(){}
	
	public Studentin(String name, String dept, int id, double score) {
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return " 이름 : " + name + "\n 학과 : " + dept + "\n 학번 : " + id + "\n 학점평균 : " + score;
	}
	
}

public class prac07_5 {
	
	public static void main(String[] args) {

		ArrayList<Studentin> a = new ArrayList<Studentin>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String msg = sc.nextLine();
			StringTokenizer st = new StringTokenizer(msg, ",");
			a.add(new Studentin(st.nextToken().trim(), st.nextToken().trim(),
					Integer.parseInt(st.nextToken().trim() ), Double.parseDouble(st.nextToken().trim() ) ) );
		}
		
		
		System.out.println("-".repeat(30));
		
		
		//toString()
		for (Studentin st : a) {
			System.out.println(st);
			System.out.println("-".repeat(30));
		}
		
		
		//get()
//		for (Studentin st : a) {
//			System.out.println("이름 : " + st.getName());
//			System.out.println("학과 : " + st.getDept());
//			System.out.println("학번 : " + st.getId());
//			System.out.println("학점평균 : " + st.getScore());
//		}
		
		//기존방법
		while (true) {
			System.out.print("학생 이름 >> ");
			String as  = sc.next().trim();
			
			if(as.equals("그만")) {
				System.out.println("종료...");
				break;
			}
			
			for (Studentin st : a) {
				if(st.getName().equals(as)) {
					System.out.println(st.getName() + ", " + st.getDept() + ", " + st.getId() + ", " + st.getScore());
				}
			}
		}
		
		
		//Iterator 사용
		Iterator<Studentin> it = a.iterator();
		while (it.hasNext()) {
			System.out.print("학생 이름 >> ");
			String as  = sc.next().trim();
			Studentin sss = it.next();
				if(sss.getName().equals(as)) {
					System.out.println(sss.getName() + ", " + sss.getDept() + ", " + sss.getId() + ", " + sss.getScore());
				}
			
		}
		
		sc.close();
		
	}

}
