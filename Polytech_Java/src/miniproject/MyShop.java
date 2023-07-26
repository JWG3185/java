package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {

	//쇼핑몰 프로그램을 위한 필드
	
	// 등록 사용자 정보 배열
	User[] users = new User[2];
	// 등록 상품 정보 배열
	Product[] products = new Product[4];
	// 상품 정보를 추가할 수 있는 장바구니
	ArrayList<Product> cart = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);

	// todo : 추가적으로 필요할 필드
	/*----------------------------------------------------*/
	String title;							// 쇼핑몰 이름
	int sel_user;							// 선택된 사용자 인덱스
	int sum;								// 장바구니 가격 합계
	
	/*----------------------------------------------------*/
	//쇼핑몰의 제목
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/*----------------------------------------------------*/
	//사용자 정보를 등록
	@Override
	public void genUser() {
		User user = new User("홍길동", PayType.CARD);
		users[0] = user;
		user = new User("정웅기", PayType.CASH);
		users[1] = user;
	}
	
	/*----------------------------------------------------*/
	//상품 정보를 등록
	@Override
	public void genProduct() {
		// CellPhone 등록
		CellPhone cell = new CellPhone("갤럭시노트20", 1500000, "SKT");
		products[0] = cell;
		cell = new CellPhone("애플아이폰14", 1000000, "KT");
		products[1] = cell;
		// SmartTV 등록
		SmartTV tv = new SmartTV("삼성 SmartTV", 3000000, "4K");
		products[2] = tv;
		tv = new SmartTV("LG SmartTV", 3000000, "FullHD");
		products[3] = tv;
	}
	
	
	/*----------------------------------------------------*/
	//상품 정보 출력
	public void productList() {
		System.out.println(title + ": 상품 목록 - 상품 선택");
		System.out.println("=".repeat(40) );
		
		int index = 0;
		for (Product p : products) {
			System.out.print("[" + index++ + "] ");
			p.printDetail();
			System.out.println();
		}
		
		System.out.println("[h] 메인화면 ");	// start 메소드
		System.out.println("[c] 체크아웃 ");	// checkOut 메소드
		System.out.print("선택 : ");
		
		String select = scan.next();		// h, c, 상품index
		switch (select) {
			case "h":						// 메인화면으로		
				start();
				break;
			case "c":						// 체크아웃으로
				checkOut();
				break;
			default:
				//1. select 값을 int형으로 바꾸고
				//2. select값의 인덱스에 대한 products 정보를
				//3. cart에 add시킨다.
				cart.add(products[Integer.parseInt(select) ] );
				productList();
		}
		
		// todo : 더 할 일 없는지 체크
		
	}
	
	/*----------------------------------------------------*/
	//쇼핑몰의 메인화면을 띄우기 위한 기능
	@Override
	public void start() {
		System.out.println(title + ": 메인화면 - 계정 선택");
		System.out.println("=".repeat(40) );
		
		int index = 0;
		for (User u : users) {
			System.out.println("[" + index++ + "] " + u.toString() );
		}
		
		System.out.println("[x] 종 료");		// System.exit(0) 호출 - 프로그램 종료
		System.out.print("선택 : ");
		
		String select = scan.next();		// 종료, 사용자 선택
		switch (select) {
			case "x":						// 종료	
				System.out.print("###쇼핑몰 프로그램이 종료됩니다.###");
				System.exit(0);
				break;
			default:
				sel_user = Integer.parseInt(select);
				productList();
		}
		
	}
	
	/*----------------------------------------------------*/
	//체크아웃 후 결제
	public void checkOut() {
		System.out.println(title + ": 체크아웃");
		System.out.println("=".repeat(40) );
		
		int index = 0;
		sum = 0;
		for (Product p : cart) {
			System.out.println("[" + index++ + "] " + p.toString());
			sum += p.getPrice();
		}
		
		System.out.println("=".repeat(40) );
		
		System.out.println("사용자명 : " + users[sel_user].getName() );
		System.out.println("결제방법 : " + users[sel_user].getPayType() );
		System.out.println("계산금액 : " + sum + " 원 입니다.");

		System.out.println("[p] 이전 , [q] 결제 완료");
		System.out.print("선택 : ");
		
		String select = scan.next();
		
		switch (select) {
			case "q":						// 결제 완료
				System.out.print("###쇼핑몰 프로그램이 종료됩니다.###");
				System.exit(0);
				break;
			case "p":
				productList();				// 이전 화면(상품 목록으로)
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
				checkOut();
		}
		
	}
	
	public void run(String title) {
		setTitle(title);
		genUser();
		genProduct();
		start();
	}
	
}
