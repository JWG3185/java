package chap03;

import java.util.Random;
import java.util.Scanner;
		
public class Mission10 {

	public static void main(String[] args) {
		// do while���� �̿��Ͽ� ������ ���� �� �Է� �ް� ����� ����϶�. 
		//-1�� �ԷµǸ� �Է��� �����Ѵ�.

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(�������� -1�� �Է�) >> ");
		
		int sum = 0;					// �Էµ� ������ ��
		int count = 0;					// �Էµ� ���� ����
		double avg = 0.0;				// �Էµ� ���� ���
		
		int n = 0;
		
		do{ 							
			sum += n;
			count++;
			n = scanner.nextInt();
		} while(n != -1);
		
		count = count - 1;
		
		if (count == 0)
			System.out.println("����� ���� ���� �����ϴ�.");
		else
		{
		avg = (double)sum/count;
		System.out.println("������ ������ " + count + "�� ");
		System.out.printf("����� %.2f�Դϴ�.", avg);
		}
		
		scanner.close();
		}
	
	}