package chap04;

public class Cylinder {

	//��� ����
	public Circle c;
	public double height;
	
	public double getVolume() {
		return c.getArea()*height;
	}
	
	public static void main(String args[]) {
		
		Cylinder cd = new Cylinder();
		cd.c = new Circle(10);
		cd.height = 10;
		
		System.out.println("���ڿ����� ���Ǵ� " + cd.getVolume());

	}
	
}
