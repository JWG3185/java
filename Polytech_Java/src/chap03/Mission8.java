package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission8 {

	public static void main(String[] args) {
		// while���� �̿��Ͽ� ������ ���� �� �Է� �ް� ����� ����϶�. 
		//-1�� �ԷµǸ� �Է��� �����Ѵ�.

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(�������� -1�� �Է�) >> ");
		int n = scanner.nextInt();
		
		int sum = 0;					// �Էµ� ������ ��
		int count = 0;					// �Էµ� ���� ����
		double avg = 0.0;				// �Էµ� ���� ���
		
		while(n != -1) { 				// ��Ƽ��, ���ʰ� -1
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		
		if (count == 0)
			System.out.println("����� ���� ���� �����ϴ�.");
		else
		{
		avg = (double)sum/count;
		System.out.println("������ ������ " + count + "�� ");
		System.out.println("����� " + avg + "�Դϴ�.");
		}
		
		scanner.close();
		}
	
	}