package chap03;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// 탐색 알고리즘
		// 아이유 키 순으로 정렬하기
		
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		// 정렬 전
		System.out.print("정렬 전: ");
		for(int iu: iu_height)
		{
			System.out.print(iu + " ");
		}
		System.out.println();
		
// 선택정렬============================================================
		for(int i = 0; i < 7; i++)
		{
			//최소값 알고리즘
			int min = iu_height[i];
			int min_index = i;
			for (int j = i + 1; j < 8; j++)
			{
				if(min > iu_height[j])
				{
					min = iu_height[j];
					min_index = j;
				}
			}
			
			// 교환 알고리즘
			int temp = iu_height[min_index];
			iu_height[min_index] = iu_height[i];
			iu_height[i] = temp;
		}
		
		// 출력
		System.out.print("정렬 후: ");
		for(int iu: iu_height) 
		{
			System.out.print(iu + " ");
		}
		System.out.println();
		
//==================================================================

// 탐색 알고리즘
		Scanner scan  = new Scanner(System.in);
		System.out.println("순차 탐색============================");
		System.out.print("검색키값 : ");
		int key = scan.nextInt();
		int key_index = -1;			// 검색된 값의 인덱스값, -1은 실패로 가정
		int count = 0;
		
		// 순차탐색 (Sequential Search)
		for(int i = 0; i < 8; i++)
		{
			count++;
			if(iu_height[i] == key)
			{
				key_index = i;
			}
		}
		
		if(key_index == -1)
		{
			System.out.println(count + "번 돌아갔습니다. 검색실패!");
		}
		else
		{
			System.out.println(count + "번 돌아갔습니다. 검색성공! " + key_index + "번 방에 있습니다.");
		}
		
		// 이진 탐색 (Binary Search)
		System.out.println("이진 탐색============================");
		
		int low = 0, high = 7;		// low, high 초기화
		int middle = 0;				// 중간방의 인덱스	
		
		System.out.print("검색키값 : ");
		key = scan.nextInt();
		key_index = -1;				// 검색된 값의 인덱스값, -1은 실패로 가정
		count = 0;
		
		while(low <= high)
		{
			count++;
			middle = (low + high) / 2;
			System.out.println("[low] " + low + " [high] " +
			high + " [middle] " + middle + " [value] " + iu_height[middle]);
			
			if(key == iu_height[middle])
			{
				key_index = middle;
				break;
			}
			else if(key > iu_height[middle])
			{
				low = middle + 1;
			}
			else if(key < iu_height[middle])
			{
				high = middle - 1;
			}
		}
		
		if(key_index == -1)
		{
			System.out.println(count + "번 돌아갔습니다. 검색실패!");
		}
		else
		{
			System.out.println(count + "번 돌아갔습니다. 검색성공! " + key_index + "번 방에 있습니다.");
		}
		
		System.out.println("원소의 개수: " + iu_height.length);
		
		// length 사용해서 원소 개수 구하기, 출력하기
		for(int i = 0; i < iu_height.length; i++)
		{
			System.out.println(iu_height[i] + " ");
		}
		
		
		
		
		scan.close();
		
	}

}
