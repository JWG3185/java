package chap08;

import java.util.Scanner;
import java.util.Vector;

//HangmanGame ���� 
//1. �ܾ �������� ���
//2. ���� 2���� ����� ���(HiddenWord) : 2���� ���ڸ� ����� �ش� ���ڴ� _ ǥ�÷� �ٲ�
//3. ���ڸ� �ϳ��� �����ش�. ���� ���ڷ� ��ġ�ϴ��� �´ٰ� ���ְ� _ ��� �ش� ���ڷ� ��ü�ϴ� ���
//4. 2������ ���� �� �ֵ��� �ϴ� ���
//5. ���� ������ ���� �� �ִ� ���(run)


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
		System.out.println("��� ������ �����մϴ�.");
		//������ Word �����ڿ� �־� Vector�� ��ȯ
		Word word = new Word("C:\\javaex\\words.txt");
		
		//���ӽ���
		while(true) {
			//������ �ܾ Vector���� ��������
			randomWord = word.getRandomWord();
			System.out.println(randomWord);
			//���� 2���� ���ܼ� hiddenWord�� �����
			hideLetters();
//			System.out.println(hiddenWord);
			//���� ����, �õ�Ƚ�� ������ ���ڸ� �ϼ���Ű��
			go();
			if(success) {
				System.out.println("����");
			}
			else {
				System.out.println(TrialMax + "�� �����߽��ϴ�.");
			}
			System.out.println("������ �� �Ͻðڽ��ϱ�? (y/n) ");
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








