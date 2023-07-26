package chap08;

import java.util.Scanner;
import java.util.Vector;

//HangmanGame 구성 
//1. 단어를 가져오는 기능
//2. 글자 2개를 숨기는 기능(HiddenWord) : 2개의 글자를 숨기고 해당 글자는 _ 표시로 바꿈
//3. 글자를 하나씩 맞춰준다. 숨긴 문자롸 일치하는지 맞다고 해주고 _ 대신 해당 문자로 교체하는 기능
//4. 2개까지 맞출 수 있도록 하는 기능
//5. 직접 게임을 해줄 수 있는 기능(run)


public class HangmanGameEx {

	String randomWord;
	Scanner scan = new Scanner(System.in);
	final int BlankMax = 2;
	final int TrialMax = 5;
	StringBuilder hiddenWord;
	Vector<Integer> index;
	Vector<Character> saveChar;
	boolean success;
	
	
	void run() {		
		System.out.println("행맨 게임을 시작합니다.");
		//파일을 Word 생성자에 넣어 Vector로 전환
		Word word = new Word("C:\\javaex\\words.txt");
		
		//게임시작
		while(true) {
			//랜덤한 단어를 Vector에서 꺼내오기
			randomWord = word.getRandomWord();
			System.out.println(randomWord);
			//글자 2개를 숨겨서 hiddenWord를 만들기
			hideLetters();
//			System.out.println(hiddenWord);
			//게임 진행, 시도횟수 내에서 글자를 완성시키기
			go();
			if(success) {
				System.out.println("성공");
			}
			else {
				System.out.println(TrialMax + "번 실패했습니다.");
			}
			System.out.println("게임을 더 하시겠습니까? (y/n) ");
			if(scan.next().equals("n") ) break;
		}
		
	}
	
	void hideLetters(){
		index = new Vector<Integer>();
		saveChar = new Vector<Character>();
		hiddenWord = new StringBuilder(randomWord);
		
		for(int i=0; i < BlankMax; i++) {
			int num = (int) (Math.random()*randomWord.length());
			if(index.contains(num)) {
				i--;
			}
			else {
				index.add(num);
				char cha = randomWord.charAt(num);
				saveChar.add(i, cha);
				hiddenWord.setCharAt(num,'_');
			}
		}	
	}
	
	boolean go() {
		
		int count=0;
		success = false;
		while(true) {
			count++;
			if(count> TrialMax) break;
			System.out.println(hiddenWord);
			System.out.println(">>");
			String text = scan.next();
			char key = text.charAt(0);
			if(saveChar.contains(key)) {
				for(int i=0; i<randomWord.length(); i++) {
					if(randomWord.charAt(i)==key) {
						hiddenWord.setCharAt(i, key);
					}
				}
			}
			String msg = new String(hiddenWord);
			if(randomWord.equals(msg)) {
				success = true;
				System.out.println(hiddenWord);
				break;
			}
		}
		return success;
	}
	
	public static void main(String[] args) {
		HangmanGameEx game = new HangmanGameEx();
		game.run();
	}

}








