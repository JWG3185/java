package chap08;

import java.util.Scanner;

public class WordSearchEx {
	
	Scanner scan = new Scanner(System.in);
	Word word;
	int count;
	
	//1. �ܾ� �˻�
	void go() {
		while(true) {
			System.out.print("�ܾ�>>");
			String search = scan.nextLine();
			
			if(search.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			
			count = 0;
			for (String st : word.wordVector) {
				try {
					if(st.substring(0, search.length() ).equals(search) ) {
						count++;
						System.out.println(st);
					}
				} catch(StringIndexOutOfBoundsException e) {
					continue;
				}
			}
			
			if (count == 0) {
				System.out.println("�ܾ �߰��� �� ����");
			}
			else {
				System.out.println(count  + "���� �ܾ �߰�!");
			}
			
		}
	}
	
	//2. �ܾ�ã�� ����
	void run() {
		System.out.println("�ܾ� ã�� ������ �����մϴ�.");
		//������ Word �����ڿ� �־� Vector�� ��ȯ
		word = new Word("C:\\javaex\\words.txt");
		//word.wordVector�� �ܾ���� ����Ǿ� ����
		
		//���ӽ���
		go();
	}
	
	public static void main(String[] args) {
		WordSearchEx ws = new WordSearchEx();
		ws.run();
	}
	
}
