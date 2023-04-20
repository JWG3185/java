package chap05;

class Person {
	String name;
	int id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String depart;
	public Student(String name) {
		super(name);
	}
}

public class UpcastingEx {

	public static void main(String[] args) {
		//Upcasting
		Person p = new Student("������");	
		System.out.println(p.name);
		//System.out.println(p.grade);	//����ȵ�
										//Upcasting���� Student�� ���.
		Student s = new Student("������");
		System.out.println(s.grade);
		
		//Downcasting
		Student s2 = (Student)p;	
		System.out.println(s2.name);
		s2.depart = "������ũ";
		System.out.println(s2.depart);
		
		//Student s3 = (Student)new Person("������");
		//System.out.println(s3.name);	//������
		
		if(p instanceof Person) {
			System.out.println("Person");
		}
		else {
			System.out.println("Person �ƴϾ�");
		}
		
	}

}
