package chap04;

public class Book {
	
	//�ɹ� ����
	String title;
	String author;
	String name = "������";
	
	//�޼ҵ�
	//������ �޼ҵ�
	Book() {
		System.out.println(name);
	}
	Book(String title) {
		this("", "");
		this.title = title;
		author = "�۰� �̻�";
	}
	
	//������ �����ε�
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//�Ϲ� �޼ҵ� ����
	void printBook() {
		System.out.println(this.title + " : " + this.author);
	}
	
	public static void main(String args[]) {
		Book book = new Book();
		Book loveStory = new Book("������");
		Book littlePrince = new Book("�����", "�������丮");
		
		loveStory.printBook();
		littlePrince.printBook();
		
		book.title = "���⿹��";
		System.out.println(book.title);
		
		
	}
	
}
