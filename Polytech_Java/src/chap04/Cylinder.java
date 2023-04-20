package chap04;

public class Cylinder {

	//멤버 변수
	public Circle c;
	public double height;
	
	public double getVolume() {
		return c.getArea()*height;
	}
	
	public static void main(String args[]) {
		
		Cylinder cd = new Cylinder();
		cd.c = new Circle(10);
		cd.height = 10;
		
		System.out.println("피자원통의 부피는 " + cd.getVolume());

	}
	
}
