package chap04;


public class Circle {

	//�ʵ� : �Ӽ�		====================================
	public double radius;   						//��� ����
	public static final double PI = 3.14;		//Ŭ���� ����, �����
	public static String Circle_name = "����";	//Ŭ���� ����
	
	//�޼ҵ� : ����			====================================
	//������ �޼ҵ�
	public Circle(){}		// �⺻(Default)������, ��������
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//�Ϲ� �޼ҵ�(��� �Լ�)
	double getArea() {
			return PI*radius*radius;
		}
	static double getArea(double radius) {
		return PI*radius*radius;
	}
	
	//���� �޼ҵ�
	public static void main(String args[]) {
//		Circle c = new Circle();
//		
//		
//		System.out.println(c.name);
//		System.out.println(c.radius);
//		System.out.println(c.PI);
//		System.out.println("====================");
//		
//		Circle c1 = new Circle("��1", 3);
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
		System.out.println("������ ũ��� " + pizza.getArea());
		System.out.println("������ ũ��� " + donut.getArea());
		System.out.println(Circle.getArea(3.0));
		System.out.println(getArea(3.0));
		
	}

}