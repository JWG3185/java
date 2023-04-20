package chap04;

public class Student1 {

	private String stu_de;
	private int stu_id;
	
	public Student1() {
	}
	
	public Student1(String stu_de) {
		this.stu_de = stu_de;
	}

	public Student1(String stu_de, int stu_id) {
		this.stu_de = stu_de;
		this.stu_id = stu_id;
	}
	
	public String getStu_de() {
		return stu_de;
	}
	public void setStu_de(String stu_de) {
		this.stu_de = stu_de;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	@Override
	public String toString() {
		return "Student1 [stu_de=" + stu_de + ", stu_id=" + stu_id + "]";
	}
	
}
