package chap04;

public class MyMetric {
	
	static double kilo;
	static double mile;
	
	public static double kiloToMile(double kilo) {
		return kilo/1.6093;
	}
	
	public static double mileToKilo(double mile) {
		return mile*1.6093;
	}
	
	public static void main(String[] args) {
		
		System.out.println(kiloToMile(1));
		System.out.println(mileToKilo(1));
		
	}
	
	
}
