package chap06;

import java.util.Scanner;

public class AlpahabetHistogram {

	int hist[] = new int[26];
	
	AlpahabetHistogram() {
		for(int i: hist) {
			i = 0;
		}
	}
	
	
	//�ؽ�Ʈ�� �Է¹޾� �ϳ��� StringBuffer�� ���̰�, String���� �����Ͽ� �����ϴ� �޼ҵ�
	String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		while(true) {
			String line = scan.nextLine();
			//if(line.equals(";")) break;
			if(line.length() == 1 && line.charAt(0) == ';') 
				{ 
				break;
				}
			sb.append(line);
		}
		scan.close();
		return sb.toString();
	}
	
	
	//readString()�� ���� ������� �ؽ�Ʈ�� ���ĺ� ���� ī�����ϴ� �޼ҵ�
	
	void checkAlpabet(String msg){
		String s = msg.toUpperCase();
		
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 'A' && i <= 'Z') 
			{
				hist[s.charAt(i)-'A']++;
			}
		}
	}
	
	
	//������׷��� �׸��� �޼ҵ�
	void drawHistogram1(){
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
			for(int j = 0; j < hist[ i - 'A']; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
	
	void drawHistogram2(){
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i + " " + "��".repeat(hist[ i - 'A']));
			}
		}

	
	//������ ���ִ� �޼ҵ�
	void run(){
		checkAlpabet(readString());
		drawHistogram2();
	}
	
	
	public static void main(String[] args) {
		
		AlpahabetHistogram a = new AlpahabetHistogram();

		a.run();
		
	}

}


