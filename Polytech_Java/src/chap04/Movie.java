package chap04;

public class Movie {
	
	String name;
	int year;
	
	public Movie() {}
	public Movie(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String print() {
		return "��ȭ���� : " + name + "\n" + "�������� : "  + year; 
	}
	
	public static void main(String[] args) {
		Movie m = new Movie("If only", 2004);
		
		System.out.println(m.print());
	}
	
}
