package chap02;

// Ŀ���� �÷��� import �ϰų� Ctrl + Shift + O�� �ѹ��� import����.
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		// new�� ������ �Ҵ� �ް� scan�̶� �̸� ����. 
		// �Է°� �޾Ƽ� �Ʒ� �ܼ�â�� ���.
		System.out.print("�Է��� ������ �����ּ���. : "); 
		String msg = scan.next(); 	// ���ڿ��� �Է� ����. 
		System.out.println("msg = " + msg);
		System.out.println("===============");
		System.out.print("�Է��� ������ �����ּ���. : "); 
		int num = scan.nextInt();		// ������ �Է� ����. 
		System.out.println("num = " + num);
		scan.close();
		
	}

}
