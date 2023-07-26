package chap13;

public class TicketSystem extends Thread{
	int total;
	SellManager sm;
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + "\t - 시작");
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "\t - 판매 : " + sm.sell());
		}
		System.out.println(Thread.currentThread().getName() + "\t - 종료");
	}
	
	// 생성자
	public TicketSystem() {
		total=100;
		sm = new SellManager();
	}
	
	public static void main(String[] args) {
		System.out.println("#### 티켓 예매 시작 ####");
		TicketSystem app = new TicketSystem();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(app);
			t.start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("#### 티켓 예매 종료 ####");
	}
	
	//내부 클래스 작성
	class SellManager {
		// 티켓의 전체 갯수를 리턴하는 메소드
		synchronized int sell() {
			total--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return total;
		}
	}
}

