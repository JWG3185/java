package chap01;



// � ��ü M�� ���԰� 50kg�̸� �̸� C���, 50kg�̻� 100kg�̸��̸� B���, 100kg�̻��̸� A�������
// return�ϴ� Weight �޼ҵ带 ������
public class Submission1 {
	public static String Weight(double x) {
		if (x<50)
			return "C���";
		else if ((50<=x) && (x<100))
			return "B���";
			return "C���";
	}
		public static void main(String[] args) {
		double M = 49;	
		System.out.println("�� ��ü�� " + M + "kg�̰� " + Weight(M) + "�Դϴ�.");
	}
}
