package chap06;

public class WrapperEx {
	
	public static void main(String[] args) {

//		Integer i = new Integer(10);	//�ڽ�
		Integer i = 10;					//����ڽ�
		Integer i1 = new Integer("10");	//�����ε�
//		Integer i1 = "10";				//�̰� �ȵ�
		
		System.out.println(i);
		System.out.println(i1);
		System.out.println();
		
		char c1 = '4';
		char c2 = 'A';
		if(Character.isDigit(c1)) {
			System.out.println("c1�� ����");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println("c2�� ���ĺ�");
		}
		
	}
}
