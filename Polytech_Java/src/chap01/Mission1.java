package chap01;

// �̼� 1: �־��� ���� �µ��� ȭ�� �µ��� �ٲٴ� CtoF �޼ҵ带 �ۼ��϶�.
// F = (9/5)*C + 32
// C : 15�� ��� ����
public class Mission1 {
	public static double CtoF(double C) {
		return (9.0/5.0)*C + 32;
	}
	public static void main(String[] args) {
		double c = 15.0;
		System.out.println("ȭ���µ� : " + CtoF(c));
		System.out.println(9/5);
		System.out.println(9.0/5);
		System.out.println(9/5.0);
		System.out.println(9.0/5.0);
	}
}