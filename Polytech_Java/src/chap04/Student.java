package chap04;

public class Student {
	
	//�ɹ� ����
	String stu_de;
	int stu_id;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.stu_de = "����Ʈ����Ʈ�����а�";
		student.stu_id = 47416308;
		
		System.out.println(student.stu_de + " : " + student.stu_id);
	}
	
}
