package chap03;

public class Selection_Sort {

	public static void main(String[] args) {
		// �������� �˰���
		// ������ Ű ������ �����ϱ�
		
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		// ���� ��
		System.out.print("���� ��: ");
		for (int iu: iu_height)
		{
			System.out.print(iu + " ");
		}
		System.out.println();
		
		// 1. �ּҰ� �˰���
//		System.out.print("�ּҰ� ã��:");
//		int min = iu_height[0];
//		int min_index = 0;
//		for (int j = 1; j < 8; j++)
//		{
//			if(min>iu_height[j])
//			{
//				min = iu_height[j];
//				min_index = j;
//			}
//		}
//		System.out.print(min);
//		System.out.println(", min_index : [" + min_index + "]");
//		
//		// 2. ��ȯ �˰���
//		int temp = iu_height[min_index];
//		iu_height[min_index] = iu_height[0];
//		iu_height[0] = temp;
//
//		System.out.print("���� ��: ");
//		for (int iu: iu_height) 
//		{
//			System.out.print(iu + " ");
//		}
//		System.out.println();
		
		// �ݺ�
		for(int i = 0; i < 7; i++)
		{
			//�ּҰ� �˰���
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
			
			// ��ȯ �˰���
			int temp = iu_height[min_index];
			iu_height[min_index] = iu_height[i];
			iu_height[i] = temp;
		}
		
		// ���
		System.out.print("���� ��: ");
		for (int iu: iu_height) 
		{
			System.out.print(iu + " ");
		}
		System.out.println();
		
	}

}
