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

	// 발표할 사람 뽑기
	// 전체 인원
	String P[] = {"김여원","김정현","김준성","김초봄","박규리","박민규",
	              "박슬기","박주연","박지원","심소영","오연경","윤진수","이성진",
	              "이유진","이태형","전병남","정성호","정승복","정웅기","조아름","최지현"};

	List<String> list = new ArrayList<>(Arrays.asList(P));		// remove를 사용하기 위해 리스트로 변환
	List<String> selected = new ArrayList<>();					// 선택된 발표자 리스트
	
	
	System.out.println("발표자 수를 입력하세요>> ");					
	
	int num = sc.nextInt();										
	for (int i = 0; i < num; i++) {
	    int idx = (int) (Math.random() * list.size()); // 리스트에서 랜덤 인덱스 선택
	    String name = list.get(idx); // 선택된 발표자
	    list.remove(idx); // 리스트에서 발표자 제거
	    selected.add(name); // 선택된 발표자 리스트에 추가
	    System.out.printf("%5s", name);
	}
	System.out.println(list);

	}
	}
	


