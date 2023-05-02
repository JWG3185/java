package study;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint1 extends Point{
	String color;
	public ColorPoint1(int x, int y, String z) {
		super(x, y);
		this.color = z;
	}
	void setXY(int x, int y) {
		super.move(x, y);
	}
	void setColor(String x) {
		this.color = x;
	}

	public String toString() {
		return this.color + "���� (" + super.getX() + ", " + 
				super.getY() + ")�� ��"; 
	}
}

class ColorPoint2 extends Point{
	String color = "BLACK";
	public ColorPoint2() {
		super(0,0);
	}
	public ColorPoint2(int x, int y) {
		super(x, y);
	}
	void setXY(int x, int y) {
		super.move(x, y);
	}
	void setColor(String x) {
		this.color = x;
	}
	public String toString() {
		return this.color + "���� (" + super.getX() + ", " + 
	super.getY() + ")�� ��"; 
	}
}

class Point3D extends Point {
	int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	void moveUp() {
		this.z = this.z + 1;
	}
	void moveDown() {
		this.z = this.z - 1;
	}
	// move()�޼��� �����ε�
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")�� ��"; 
	}
}

class PositivePoint extends Point {
	public PositivePoint() {
		super(0, 0);
	}
	public PositivePoint(int x, int y) {
		super(0, 0);
		if (x > 0 & y > 0) {
			super.move(x, y);
		}
	}
	@Override
	protected void move(int x, int y) {
		if (x > 0 & y > 0) {
			super.move(x, y);
		}
	}
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ")�� ��"; 
	}
}

public class exam_5_5 {

	public static void main(String[] args) {
		
		//5.
		ColorPoint1 cp1 = new ColorPoint1(5,5,"YELLOW");
		cp1.setXY(10, 20);
		cp1.setColor("RED");
		String str = cp1.toString();
		System.out.println(str + "�Դϴ�.");
		
		System.out.println("===========================");
		
		//6.
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint2 cp2 = new ColorPoint2(10, 10);
		cp2.setXY(5, 5);
		cp2.setColor("RED");
		System.out.println(cp2.toString() + "�Դϴ�.");
		
		System.out.println("===========================");

		//7.
		Point3D p1 = new Point3D(1, 2, 3);
		System.out.println(p1.toString() + "�Դϴ�.");
		
		p1.moveUp();
		System.out.println(p1.toString() + "�Դϴ�.");
		p1.moveDown();
		p1.move(10, 10);
		System.out.println(p1.toString() + "�Դϴ�.");
		
		p1.move(100, 200, 300);
		System.out.println(p1.toString() + "�Դϴ�.");
		
		System.out.println("===========================");
		
		//8. 
		PositivePoint p2 = new PositivePoint();
		p2.move(10, 10);
		System.out.println(p2.toString() + "�Դϴ�.");
		
		p2.move(-5, 5);
		System.out.println(p2.toString() + "�Դϴ�.");
		
		PositivePoint p3 = new PositivePoint(-10, -10);
		System.out.println(p3.toString() + "�Դϴ�.");
		
	}

}
