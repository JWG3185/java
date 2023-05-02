package study;

public class Circle {
	
	private int x;
	private int y;
	private int r;

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	
	@Override
	public String toString() {
		return "Circle(" + this.x + "," + this.y + ")������" + this.r;
	}
	
	Boolean equals(Circle c) {
		if (this.x == c.x && this.y == c.y) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}
