package miniproject_db;

public class SmartTV extends Product{
	
	public SmartTV() {}
	
	public SmartTV(String pname, int price, String mf) {
		this.pname = pname;
		this.price = price;
		this.mf = mf;
	}
	
	@Override
	public void printExtra() {
		System.out.print("ÇØ»óµµ : " + mf);
	}

}
