package chap13;

public class RunnableEx extends Thread implements Runnable{

	@Override
	public void run() {
		System.out.println("run에서 실행된 결과!");
	}
	
	
	public static void main(String[] args) {
		
		RunnableEx ex = new RunnableEx();
		
		ex.start();
		
		System.out.println("main에서 실행된 결과");
		
	}
}
