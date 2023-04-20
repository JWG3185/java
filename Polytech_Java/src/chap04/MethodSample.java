package chap04;

public class MethodSample {
	
	//메소드 오버로딩
	int getSum(int x, int y){
		return x + y;
	}
	int getSum(int x, int y, int z){
		return x + y + z;
	}
	double getSum(double x, double y){
		return x + y;
	}
	//double getSum(int x, int y){		//파라미터의 개수나 타입이 변경되어야만함.
	//	return (double)x + y;			//그래야 메소드 오버로딩이라 함.
	//}

	public static void main(String[] args) {
		MethodSample sample = new MethodSample();
		
		System.out.println(sample.getSum(1, 2));
		System.out.println(sample.getSum(1, 2, 3));
		System.out.println(sample.getSum(2.0, 3.0));
	
	}
	
}
