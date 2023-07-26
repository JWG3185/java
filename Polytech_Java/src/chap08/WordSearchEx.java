package chap08;

import java.util.Scanner;

public class WordSearchEx {
	
	Scanner scan = new Scanner(System.in);
	Word word;
	int count;
	
	//1. 단어 검색
	void go() {
		while(true) {
			System.out.print("단어>>");
			String search = scan.nextLine();
			
			if(search.equals("그만")) {
				System.out.println("종료합니다...");
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
				System.out.println("단어를 발견할 수 없음");
			}
			else {
				System.out.println(count  + "개의 단어를 발견!");
			}
			
		}
	}
	
	//2. 단어찾기 게임
	void run() {
		System.out.println("단어 찾기 게임을 시작합니다.");
		//파일을 Word 생성자에 넣어 Vector로 전환
		word = new Word("C:\\javaex\\words.txt");
		//word.wordVector에 단어들이 저장되어 있음
		
		//게임시작
		go();
	}
	
	public static void main(String[] args) {
		WordSearchEx ws = new WordSearchEx();
		ws.run();
	}
	
}
