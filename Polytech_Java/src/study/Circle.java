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
		return "Circle(" + this.x + "," + this.y + ")반지름" + this.r;
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
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
