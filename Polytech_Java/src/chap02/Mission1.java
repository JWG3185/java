package chap02;

public class Mission1 {

	public static void main(String[] args) {
		boolean result;				//Boolean : ���۷��� Ÿ��(�պκ� �빮��)
		result = 3 == 5;
		System.out.println(result);
		System.out.println("===============");
		
		//�ڹٴ� ���ʰ��� ������ ���� Ÿ���� ���� ����.
		//int a = 3.5;	//�ڹٿ��� ����
		int a = (int) 3.5;	//�����ٿ� Ŀ�� �ø��� ĳ���� ����
		System.out.println(a);
		System.out.println("===============");
		
		//��ȣȭ, ��ȣȭ(XOR)
		int plain = 10;
		int key = 8;
		int cyper = plain ^ key;
		System.out.println("cyper = " + cyper);			//��ȣȭ
		System.out.println("plain = " + (cyper ^ key));	//��ȣȭ
		System.out.println("===============");
		
		//��Ʈ�̵�������
		System.out.println(10 >> 1);					// 1/2��
		System.out.println(10 << 1);					//2��
		System.out.println("===============");

		//var Ű���带 ����Ͽ� ���� Ÿ�� ����
		var v = 30;
		System.out.println(v);
		System.out.println("===============");
		
		
		
		
		
		
		
	}
}
