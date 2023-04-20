package chap04;

public class Cylinder2 {

	//��� ����
	public Circle c;
	public double height;
	
	public Cylinder2(){}		// �⺻(Default)������, ��������
	
	public Cylinder2(Circle c,double height) {
		this.c = c;
		this.height = height;
	}
	
	public double getVolume() {
		return c.getArea()*height;
	}
	
	public static void main(String args[]) {
		Cylinder2 cd = new Cylinder2(new Circle(2.8), 5.6);
		
		System.out.println(cd.getVolume());

	}
	
}
