package miniproject;

public interface IShop {
	
	//쇼핑몰의 제목
	public abstract void setTitle(String title);
	
	//사용자 정보를 등록
	public abstract void genUser();
	
	//상품 정보를 등록
	public abstract void genProduct();
	
	//쇼핑몰의 전체 기능을 위한 시나리오
	public abstract void start();
	
}
