package chap04;


public class Circle {

	//필드 : 속성		====================================
	public double radius;   						//멤버 변수
	public static final double PI = 3.14;		//클래스 변수, 상수형
	public static String Circle_name = "원형";	//클래스 변수
	
	//메소드 : 행위			====================================
	//생성자 메소드
	public Circle(){}		// 기본(Default)생성자, 생략가능
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//일반 메소드(멤버 함수)
	double getArea() {
			return PI*radius*radius;
		}
	static double getArea(double radius) {
		return PI*radius*radius;
	}
	
	//메인 메소드
	public static void main(String args[]) {
//		Circle c = new Circle();
//		
//		
//		System.out.println(c.name);
//		System.out.println(c.radius);
//		System.out.println(c.PI);
//		System.out.println("====================");
//		
//		Circle c1 = new Circle("원1", 3);
//		
//		System.out.println(c1.name);
//		System.out.println(c1.radius);
//		System.out.println(c1.PI);
//		System.out.println("====================");
//		System.out.println(c.name);
//		System.out.println(c.radius);
//		System.out.println(c.PI);
//		
//		System.out.printf("%.2f \n", c1.getArea());
	
		Circle pizza = new Circle(10);
		Circle donut = new Circle(2);
		
		System.out.println(Circle.Circle_name);
		System.out.println(Circle_name);
		System.out.println("피자의 크기는 " + pizza.getArea());
		System.out.println("도넛의 크기는 " + donut.getArea());
		System.out.println(Circle.getArea(3.0));
		System.out.println(getArea(3.0));
		
	}

}