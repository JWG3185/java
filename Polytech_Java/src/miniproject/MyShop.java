package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {

	//���θ� ���α׷��� ���� �ʵ�
	
	// ��� ����� ���� �迭
	User[] users = new User[2];
	// ��� ��ǰ ���� �迭
	Product[] products = new Product[4];
	// ��ǰ ������ �߰��� �� �ִ� ��ٱ���
	ArrayList<Product> cart = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);

	// todo : �߰������� �ʿ��� �ʵ�
	/*----------------------------------------------------*/
	String title;							// ���θ� �̸�
	int sel_user;							// ���õ� ����� �ε���
	int sum;								// ��ٱ��� ���� �հ�
	
	/*----------------------------------------------------*/
	//���θ��� ����
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/*----------------------------------------------------*/
	//����� ������ ���
	@Override
	public void genUser() {
		User user = new User("ȫ�浿", PayType.CARD);
		users[0] = user;
		user = new User("������", PayType.CASH);
		users[1] = user;
	}
	
	/*----------------------------------------------------*/
	//��ǰ ������ ���
	@Override
	public void genProduct() {
		// CellPhone ���
		CellPhone cell = new CellPhone("�����ó�Ʈ20", 1500000, "SKT");
		products[0] = cell;
		cell = new CellPhone("���þ�����14", 1000000, "KT");
		products[1] = cell;
		// SmartTV ���
		SmartTV tv = new SmartTV("�Ｚ SmartTV", 3000000, "4K");
		products[2] = tv;
		tv = new SmartTV("LG SmartTV", 3000000, "FullHD");
		products[3] = tv;
	}
	
	
	/*----------------------------------------------------*/
	//��ǰ ���� ���
	public void productList() {
		System.out.println(title + ": ��ǰ ��� - ��ǰ ����");
		System.out.println("=".repeat(40) );
		
		int index = 0;
		for (Product p : products) {
			System.out.print("[" + index++ + "] ");
			p.printDetail();
			System.out.println();
		}
		
		System.out.println("[h] ����ȭ�� ");	// start �޼ҵ�
		System.out.println("[c] üũ�ƿ� ");	// checkOut �޼ҵ�
		System.out.print("���� : ");
		
		String select = scan.next();		// h, c, ��ǰindex
		switch (select) {
			case "h":						// ����ȭ������		
				start();
				break;
			case "c":						// üũ�ƿ�����
				checkOut();
				break;
			default:
				//1. select ���� int������ �ٲٰ�
				//2. select���� �ε����� ���� products ������
				//3. cart�� add��Ų��.
				cart.add(products[Integer.parseInt(select) ] );
				productList();
		}
		
		// todo : �� �� �� ������ üũ
		
	}
	
	/*----------------------------------------------------*/
	//���θ��� ����ȭ���� ���� ���� ���
	@Override
	public void start() {
		System.out.println(title + ": ����ȭ�� - ���� ����");
		System.out.println("=".repeat(40) );
		
		int index = 0;
		for (User u : users) {
			System.out.println("[" + index++ + "] " + u.toString() );
		}
		
		System.out.println("[x] �� ��");		// System.exit(0) ȣ�� - ���α׷� ����
		System.out.print("���� : ");
		
		String select = scan.next();		// ����, ����� ����
		switch (select) {
			case "x":						// ����	
				System.out.print("###���θ� ���α׷��� ����˴ϴ�.###");
				System.exit(0);
				break;
			default:
				sel_user = Integer.parseInt(select);
				productList();
		}
		
	}
	
	/*----------------------------------------------------*/
	//üũ�ƿ� �� ����
	public void checkOut() {
		System.out.println(title + ": üũ�ƿ�");
		System.out.println("=".repeat(40) );
		
		int index = 0;
		sum = 0;
		for (Product p : cart) {
			System.out.println("[" + index++ + "] " + p.toString());
			sum += p.getPrice();
		}
		
		System.out.println("=".repeat(40) );
		
		System.out.println("����ڸ� : " + users[sel_user].getName() );
		System.out.println("������� : " + users[sel_user].getPayType() );
		System.out.println("���ݾ� : " + sum + " �� �Դϴ�.");

		System.out.println("[p] ���� , [q] ���� �Ϸ�");
		System.out.print("���� : ");
		
		String select = scan.next();
		
		switch (select) {
			case "q":						// ���� �Ϸ�
				System.out.print("###���θ� ���α׷��� ����˴ϴ�.###");
				System.exit(0);
				break;
			case "p":
				productList();				// ���� ȭ��(��ǰ �������)
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���.");
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
