package study;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class pselect3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	// ��ǥ�� ��� �̱�
	// ��ü �ο�
	String P[] = {"�迩��","������","���ؼ�","���ʺ�","�ڱԸ�","�ڹα�",
	              "�ڽ���","���ֿ�","������","�ɼҿ�","������","������","�̼���",
	              "������","������","������","����ȣ","���º�","������","���Ƹ�","������"};

	List<String> list = new ArrayList<>(Arrays.asList(P));		// remove�� ����ϱ� ���� ����Ʈ�� ��ȯ
	List<String> selected = new ArrayList<>();					// ���õ� ��ǥ�� ����Ʈ
	
	
	System.out.println("��ǥ�� ���� �Է��ϼ���>> ");					
	
	int num = sc.nextInt();										
	for (int i = 0; i < num; i++) {
	    int idx = (int) (Math.random() * list.size()); // ����Ʈ���� ���� �ε��� ����
	    String name = list.get(idx); // ���õ� ��ǥ��
	    list.remove(idx); // ����Ʈ���� ��ǥ�� ����
	    selected.add(name); // ���õ� ��ǥ�� ����Ʈ�� �߰�
	    System.out.printf("%5s", name);
	}
	System.out.println(list);

	}
	}
	


