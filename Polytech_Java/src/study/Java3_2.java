package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Java3_2 {

	public static void main(String[] args) {
		// 5. ScannerŬ������ ���� 3���� �Է¹ް� 3���� ���ڷ� �ﰢ���� ����� �ִ��� �Ǻ�.
		// �ﰢ���� �Ƿ��� �� ���� ���� �ٸ� �Ѻ��� �պ��� Ŀ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3�� �Է��Ͻÿ�>>");
		int a = sc.nextInt(), b = sc.nextInt(), c =  sc.nextInt(); 
		
		// (1) ����Ʈ�� �������� �����ؼ� �� 2���� �� �ΰ��� ũ�� �� + ���ǹ� 
//		ArrayList<Integer> mylist = new ArrayList<>(Arrays.asList(a,b,c));
//		mylist.sort(Comparator.naturalOrder());
//		
//		if ((mylist.get(0) + mylist.get(1))> mylist.get(2))
//			System.out.println("�ﰢ���� �˴ϴ�");
//		else
//			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		
		// (2) ���ǹ� ���
		if (a<b+c && b<a+c && c<a+b)				// �� ���� ���̰� �ٸ� �κ��� �պ��� ũ�ų� ������ �ȵ�.
			System.out.println("�ﰢ���� �˴ϴ�");
		else
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		
		sc.close();
	}

}
