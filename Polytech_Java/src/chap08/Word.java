package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

//Word Ŭ���� ���� (������, ���� 1���� �����ϴ� �޼ҵ�)
public class Word {
	
	Vector<String> wordVector = new Vector<String>();
	
	public Word(String filename) {		
		try {
			Scanner scan = new Scanner(new FileReader(filename) );				//Scanner�� ���� �б�
			 
			while(scan.hasNextLine()) {
				wordVector.add(scan.nextLine() );									//wordVector�� �ܾ� �߰�	 
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);														//���α׷� ����
		}				
	}

	public String getRandomWord() {
		final int WORDMAX = wordVector.size();
		int randomValue = (int) (Math.random()*WORDMAX);
		
		return wordVector.get(randomValue);
		
	}
}
