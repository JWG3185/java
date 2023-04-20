package chap04;

public class Book {
	
	//맴버 변수
	String title;
	String author;
	String name = "정웅기";
	
	//메소드
	//생성자 메소드
	Book() {
		System.out.println(name);
	}
	Book(String title) {
		this("", "");
		this.title = title;
		author = "작가 미상";
	}
	
	//생성자 오버로딩
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//일반 메소드 생성
	void printBook() {
		System.out.println(this.title + " : " + this.author);
	}
	
	public static void main(String args[]) {
		Book book = new Book();
		Book loveStory = new Book("춘향전");
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		
		loveStory.printBook();
		littlePrince.printBook();
		
		book.title = "웅기예요";
		System.out.println(book.title);
		
		
	}
	
}
