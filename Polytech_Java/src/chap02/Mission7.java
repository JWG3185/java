package chap02;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int score = sc.nextInt();
		
		char grade;
		// �б��� if��
		if 		(score>=90)	grade = 'A';
		else if (score>=80)	grade = 'B';
		else if (score>=70)	grade = 'C';
		else if (score>=60)	grade = 'D';
		else 				grade = 'F';
		
		System.out.println("������ " + grade + "�Դϴ�.");
		
		sc.close();
	}

}
