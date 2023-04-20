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
		Person p = new Student("정웅기");	
		System.out.println(p.name);
		//System.out.println(p.grade);	//실행안됨
										//Upcasting으로 Student를 벗어남.
		Student s = new Student("엄남경");
		System.out.println(s.grade);
		
		//Downcasting
		Student s2 = (Student)p;	
		System.out.println(s2.name);
		s2.depart = "하이테크";
		System.out.println(s2.depart);
		
		//Student s3 = (Student)new Person("엄남경");
		//System.out.println(s3.name);	//오류남
		
		if(p instanceof Person) {
			System.out.println("Person");
		}
		else {
			System.out.println("Person 아니야");
		}
		
	}

}
