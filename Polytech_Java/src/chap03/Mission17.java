package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mission17 {
	//3���� ������ �Է¹޾� ���� ���ϴ� ���α׷��� �ۼ��϶�. 
	//����ڰ� ������ �ƴ� ���ڸ� �Է��� �� �߻��ϴ� 
	//InputMismatchException ���ܸ� ó���Ͽ� �ٽ� �Է¹޵��� �϶�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ���.");
		int sum = 0, n = 0;
		
		for(int i=0;i<3;i++) {
			try {
				n = sc.nextInt();		//���� �Է�
				}
			
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				sc.next();				//�Է� ��Ʈ�ӿ� �ִ� ������ �ƴ� ��ū�� ������.
				i--;					//�ε����� �������� �ʵ��� �̸� ����
				continue;				//���� ����
			}
			sum += n;					//��
		}
		System.out.println("���� " + sum);
		sc.close();
	}

}
