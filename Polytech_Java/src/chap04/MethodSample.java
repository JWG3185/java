package chap04;

public class MethodSample {
	
	//�޼ҵ� �����ε�
	int getSum(int x, int y){
		return x + y;
	}
	int getSum(int x, int y, int z){
		return x + y + z;
	}
	double getSum(double x, double y){
		return x + y;
	}
	//double getSum(int x, int y){		//�Ķ������ ������ Ÿ���� ����Ǿ�߸���.
	//	return (double)x + y;			//�׷��� �޼ҵ� �����ε��̶� ��.
	//}

	public static void main(String[] args) {
		MethodSample sample = new MethodSample();
		
		System.out.println(sample.getSum(1, 2));
		System.out.println(sample.getSum(1, 2, 3));
		System.out.println(sample.getSum(2.0, 3.0));
	
	}
	
}
