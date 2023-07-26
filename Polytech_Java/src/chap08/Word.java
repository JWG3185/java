package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

//Word 클래스 구성 (생성자, 글자 1개를 추출하는 메소드)
public class Word {
	
	Vector<String> wordVector = new Vector<String>();
	
	public Word(String filename) {		
		try {
			Scanner scan = new Scanner(new FileReader(filename) );				//Scanner로 파일 읽기
			 
			while(scan.hasNextLine()) {
				wordVector.add(scan.nextLine() );									//wordVector에 단어 추가	 
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0);														//프로그램 종료
		}				
	}

	public String getRandomWord() {
		final int WORDMAX = wordVector.size();
		int randomValue = (int) (Math.random()*WORDMAX);
		
		return wordVector.get(randomValue);
		
	}
}
