package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		// 4. ScannerŬ������ ���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ����϶�.
		// ��հ��� ���ϴ� ���� �ƴԿ� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>");
		int a = sc.nextInt(), b = sc.nextInt(), c =  sc.nextInt(); 
		
		// (1)����Ʈ �ȿ� a, b, c �ְ� �������� �����ϰ� �ι�° �� �̱�
//		ArrayList<Integer> mylist = new ArrayList<>(Arrays.asList(a,b,c));
//		mylist.sort(Comparator.naturalOrder());
//		System.out.println(mylist);
//		System.out.println(mylist.get(1));
		
		// (2) ���ǹ� ����
		if (a>=b && a<=c)				// a�� �߰��� ���ְ�, ũ����� b a c�� ���
			System.out.println(a);
		else if (a>=c && a<=b)			// a�� �߰��� ���ְ�, ũ����� c a b�� ���
			System.out.println(a);
		else if (b>=a && b<=c)			// b�� �߰��� ���ְ�, ũ����� a b c�� ���
			System.out.println(b);
		else if (b>=c && b<=a)			// b�� �߰��� ���ְ�, ũ����� c b a�� ���
			System.out.println(b);
		else if (c>=a && c<=b)			// c�� �߰��� ���ְ�, ũ����� a c b�� ���
			System.out.println(c);
		else 							// c�� �߰��� ���ְ�, ũ����� b c a�� ���
			System.out.println(c);
		
		sc.close();
	}

}
