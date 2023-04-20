package chap05;

abstract class Shape1 {
	
	abstract void draw();
	void paint() {
		System.out.println("paint 메소드 호출");
	}
	void print() {
		System.out.println("print 메소드 호출");
	}
	
}

class RealShape extends Shape1{
	@Override
	void draw() {
		System.out.println("draw 메소드 호출");
	}
}

public class Shape1_Abstract_Ex {
	
	public static void main(String[] args) {
		Shape1 sp = new RealShape();
		sp.paint();
		sp.print();
		sp.draw();
	}
	
}


