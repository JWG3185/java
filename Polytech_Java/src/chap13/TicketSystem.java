package chap13;

public class TicketSystem extends Thread{
	int total;
	SellManager sm;
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + "\t - ����");
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "\t - �Ǹ� : " + sm.sell());
		}
		System.out.println(Thread.currentThread().getName() + "\t - ����");
	}
	
	// ������
	public TicketSystem() {
		total=100;
		sm = new SellManager();
	}
	
	public static void main(String[] args) {
		System.out.println("#### Ƽ�� ���� ���� ####");
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
		System.out.println("#### Ƽ�� ���� ���� ####");
	}
	
	//���� Ŭ���� �ۼ�
	class SellManager {
		// Ƽ���� ��ü ������ �����ϴ� �޼ҵ�
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

