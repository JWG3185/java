package chap07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;


public class prac07_7 {

	private HashMap<String, Double> h = new HashMap<String, Double>();
	private Scanner sc = new Scanner(System.in);
	private double standard;
	
	
	public double getStandard() {
		return standard;
	}


	public void setStandard(double standard) {
		this.standard = standard;
	}


	void stuIn(int num){
		int i = 0;
		while(i < num) {
			System.out.print("�̸��� ���� >> ");
			String msg = sc.nextLine();
			StringTokenizer st = new StringTokenizer(msg, " ");
			h.put(st.nextToken(), Double.parseDouble(st.nextToken() ) );
			
			i++;
		}
	}
	
	void chech(double standard) {
		this.setStandard(standard);
		System.out.print("���л� ��� :");
		for (String name : this.h.keySet()) {
			if(this.h.get(name) >= this.getStandard()) {
				System.out.print(" " + name );
			}
		}
	}
	
	public static void main(String[] args) {

		prac07_7 p7 = new prac07_7();
		
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		
		p7.stuIn(5);
		
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		
		p7.chech(p7.sc.nextDouble() );
		
	}

}
