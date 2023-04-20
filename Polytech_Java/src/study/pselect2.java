package study;

import java.util.Random;
import java.util.Scanner;

public class pselect2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 발표할 사람 뽑기 {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		String P[] = {"김여원","김정현","김준성","김초봄","박규리","박민규",					//전체 인원 배열		
				"박슬기","박주연","박지원","심소영","오연경","윤진수","이성진",
				"이유진","이태형","전병남","정성호","정승복","정웅기","조아름","최지현"};
		
		System.out.print("발표자 수를 입력하세요>> ");									//발표자 수 뽑기
		int num = sc.nextInt();
	
	
		int pt[] = new int[num];										//발표자 수만큼 난수 뽑아서 넣을 배열
		
		for (int i = 0; i < num; i ++)
		{
			pt[i] =(int)(Math.random() * (21));	// 0 ~ 20까지의 난수를 num개 생성
			for (int j = 0; j < i; j++) 
			{
				if (pt[i] == pt[j])
				{
					i--;
				}
			}
		}
		
		for (int nu: pt) 												// 난수를 인덱스로 발표자 뽑기
		{
			System.out.printf("%5s",P[nu]);
		}
		
		
	}

}
