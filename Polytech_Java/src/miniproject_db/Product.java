package miniproject_db;

public class Product {
	
	int pcode;
	String pname;
	int price;
	String mf = null;
	
	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMf() {
		return mf;
	}

	public void setMf(String mf) {
		this.mf = mf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printDetail() {
		System.out.print("상품코드 : " + pcode + " , ");
		System.out.print("상품명 : " + pname + " , ");
		System.out.print("상품가격 : " + price + " , ");
		printExtra();
	};

	public void printExtra(){}
	
}
