package chap01;



// 어떤 물체 M의 무게가 50kg미만 이면 C등급, 50kg이상 100kg미만이면 B등급, 100kg이상이면 A등급으로
// return하는 Weight 메소드를 만들어라
public class Submission1 {
	public static String Weight(double x) {
		if (x<50)
			return "C등급";
		else if ((50<=x) && (x<100))
			return "B등급";
			return "C등급";
	}
		public static void main(String[] args) {
		double M = 49;	
		System.out.println("이 물체는 " + M + "kg이고 " + Weight(M) + "입니다.");
	}
}
