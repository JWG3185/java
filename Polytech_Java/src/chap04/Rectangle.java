package chap04;

public class Rectangle {

	double w;
	double h;
	
	public Rectangle() {}
	
	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}
	
	public double area() {
		return w*h;
	}
	
	public double perimeter() {
		return 2*w + 2*h;
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(3,5);
		
		System.out.println("���̴� " + r.area());
		System.out.println("�ѷ��� " + r.perimeter());
		System.out.println(2^2);
		
	}
	
}
