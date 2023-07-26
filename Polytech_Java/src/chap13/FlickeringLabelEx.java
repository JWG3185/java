package chap13;

import javax.swing.*;
import java.awt.*;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		setFont(new Font("����", Font.BOLD, 30));
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		int n = 0;		//�����ʱⰪ
		while (true) {	//���ѷ���
			if(n==0)setBackground(Color.cyan);
			else 	setBackground(Color.blue);
			
			if(n==0)n=1;
			else 	n=0;
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class FlickeringLabelEx extends JFrame{

	public FlickeringLabelEx() {
		setTitle("���ڰŸ��� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		//label - 3���� ����
		FlickeringLabel label1  = new FlickeringLabel("0.5��", 500);
		JLabel label2 = new JLabel("�ȱ���");
		label2.setFont(new Font("����", Font.BOLD, 30));
		FlickeringLabel label3  = new FlickeringLabel("1��", 1000);
		
		//label�� �����̳ʿ� ����
		c.add(label1);
		c.add(label2);
		c.add(label3);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FlickeringLabelEx fl = new FlickeringLabelEx();
	}
	
}
