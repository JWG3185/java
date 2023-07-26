package miniproject_db;

public class User {
	
	String name;
	int uid;
	PayType payType;
	
	public User(String name, int uid, PayType payType) {
		super();
		this.name = name;
		this.uid = uid;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}

	@Override
	public String toString() {
		return name + "(" + payType + ")";
	}
	
}
