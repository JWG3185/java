package chap04;

public class Student {
	
	//맴버 변수
	String stu_de;
	int stu_id;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.stu_de = "스마트소프트웨어학과";
		student.stu_id = 47416308;
		
		System.out.println(student.stu_de + " : " + student.stu_id);
	}
	
}
