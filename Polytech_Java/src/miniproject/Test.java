package miniproject;

public class Test {
	private String uname;
	private String email;
	
	public Test() {super();}
	
	public Test(String uname, String email) {
		super();
		this.uname = uname;
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
