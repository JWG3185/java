package chap04;

public class ComplexNumber {
	
	double real;
	double imag;
	
	public ComplexNumber() {}
	public ComplexNumber(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String print() {
		return real + " + " + imag + "i"; 
		
	}
	public static void main(String[] args) {
		
		ComplexNumber c = new ComplexNumber(1,2);
		
		System.out.println(c.print());
		
	}
}
