package chap02;

// 커서를 올려서 import 하거나 Ctrl + Shift + O로 한번에 import가능.
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		// new로 공간을 할당 받고 scan이라 이름 붙임. 
		// 입력값 받아서 아래 콘솔창에 출력.
		System.out.print("입력할 내용을 적어주세요. : "); 
		String msg = scan.next(); 	// 문자열로 입력 받음. 
		System.out.println("msg = " + msg);
		System.out.println("===============");
		System.out.print("입력할 정수을 적어주세요. : "); 
		int num = scan.nextInt();		// 정수로 입력 받음. 
		System.out.println("num = " + num);
		scan.close();
		
	}

}
