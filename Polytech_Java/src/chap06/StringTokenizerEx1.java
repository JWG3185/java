package chap06;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
//		String data = "ȫ�浿,010-1234-5678,�����,�л�";
////		
////		//","�� �����ڷ� ����
//		StringTokenizer st = new StringTokenizer(data, ",");
////		
//		while(st.hasMoreTokens()) {
//			System.out.println("�̸� : " + st.nextToken());
//			System.out.println("��ȭ : " + st.nextToken());
//			System.out.println("�ּ� : " + st.nextToken());
//			System.out.println("���� : " + st.nextToken());
//		}
		
		String data2 = "ȫ�浿,��,65,170/�����,��,57,164/���屺,��,80,190/����,��,77,167/ȫ�̿�,��,64,165";
		//���ڵ��� ü���� ����� ���϶�.
		StringTokenizer st2 = new StringTokenizer(data2, "/");
//		ArrayList<String>  al = new ArrayList<String>();
//		al.add(st2.nextToken());
//		al.add(st2.nextToken());
//		al.add(st2.nextToken());
//		al.add(st2.nextToken());
//		
//		for(String a : al) 
//			System.out.println(a);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
		
		
		String s1 = st2.nextToken();
		String s2 = st2.nextToken();
		String s3 = st2.nextToken();
		String s4 = st2.nextToken();
		String s5 = st2.nextToken();
		
		String[] person = {s1,s2,s3,s4,s5};
		
		int sum_weight = 0;
		int count = 0;
		
		for (String p : person) {
			StringTokenizer p1 = new StringTokenizer(p, ",");
			System.out.println(p1.nextToken());
			if(p1.nextToken().equals("��")) {
				sum_weight = sum_weight + Integer.parseInt(p1.nextToken());
				count++;}
			System.out.println(p1.nextToken());
		}
		System.out.println("���ڵ��� ��� ü�� : " + sum_weight/count);
		
		
		
		
		
		
//		
//		while(st2.hasMoreTokens()) {
//			StringTokenizer st21 = new StringTokenizer(st2.nextToken(), ",");
//			while(st21.hasMoreTokens()) {
//				st21.nextToken();
//				if (st21.nextToken().equals("��")) {
//					sum_weight = sum_weight + Integer.parseInt(st21.nextToken());
//					count++;}
//				st21.nextToken();
//			}
//			StringTokenizer st22 = new StringTokenizer(st2.nextToken(), ",");
//			while(st22.hasMoreTokens()) {
//				st22.nextToken();
//				if (st22.nextToken().equals("��")) {
//					sum_weight = sum_weight + Integer.parseInt(st22.nextToken());
//					count++;}
//				st22.nextToken();
//			}
//			StringTokenizer st23 = new StringTokenizer(st2.nextToken(), ",");
//			while(st23.hasMoreTokens()) {
//				st23.nextToken();
//				if (st23.nextToken().equals("��")) {
//					sum_weight = sum_weight + Integer.parseInt(st23.nextToken());
//					count++;}
//				st23.nextToken();
//			}
//			StringTokenizer st24 = new StringTokenizer(st2.nextToken(), ",");
//			while(st24.hasMoreTokens()) {
//				st24.nextToken();
//				if (st24.nextToken().equals("��")) {
//					sum_weight = sum_weight + Integer.parseInt(st24.nextToken());
//					count++;}
//				st24.nextToken();
//			}
//			StringTokenizer st25 = new StringTokenizer(st2.nextToken(), ",");
//			while(st25.hasMoreTokens()) {
//				st25.nextToken();
//				if (st25.nextToken().equals("��")) {
//					sum_weight = sum_weight + Integer.parseInt(st25.nextToken());
//					count++;}
//				st24.nextToken();
//			}
//			
//		}
//		System.out.println("���ڵ��� ��� ü�� : " + sum_weight/count);
	}

}
