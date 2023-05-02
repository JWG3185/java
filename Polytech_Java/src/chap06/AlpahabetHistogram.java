package chap06;

import java.util.Scanner;

public class AlpahabetHistogram {

	int hist[] = new int[26];
	
	AlpahabetHistogram() {
		for(int i: hist) {
			i = 0;
		}
	}
	
	
	//텍스트를 입력받아 하나의 StringBuffer로 붙이고, String으로 변경하여 리턴하는 메소드
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
	
	
	//readString()을 통해 가지고온 텍스트를 알파벳 별로 카운팅하는 메소드
	
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
	
	
	//히스토그램을 그리는 메소드
	void drawHistogram1(){
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
			for(int j = 0; j < hist[ i - 'A']; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	void drawHistogram2(){
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i + " " + "☆".repeat(hist[ i - 'A']));
			}
		}

	
	//동작을 해주는 메소드
	void run(){
		checkAlpabet(readString());
		drawHistogram2();
	}
	
	
	public static void main(String[] args) {
		
		AlpahabetHistogram a = new AlpahabetHistogram();

		a.run();
		
	}

}


