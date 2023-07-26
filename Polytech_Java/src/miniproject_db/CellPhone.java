package miniproject_db;

public class CellPhone extends Product{
	
	public CellPhone() {}
	
	public CellPhone(String pname, int price, String mf) {
		this.pname = pname;
		this.price = price;
		this.mf = mf;
	}

	@Override
	public void printExtra() {
		System.out.print("Ελ½Ε»η : " + mf);
	}
	
}
