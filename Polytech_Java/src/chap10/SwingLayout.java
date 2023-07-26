package chap10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingLayout extends JFrame{

	JButton button1 = new JButton("��ư1");
	JButton button2 = new JButton("����");
	JButton button3 = new JButton("��ư2");
	JButton button4 = new JButton("����");
	JButton button5 = new JButton("����");
	JButton button6 = new JButton("����");
	
	Font font = new Font("���� ���", Font.BOLD, 20);
	Color color = new Color(255,0,0);
	
	Label label1 = new Label("addActionListener����");
	Label label2 = new Label("MouseAdapter");
	Label label3 = new Label("panel3");
	
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();
	
	public SwingLayout() {
		setTitle("���� ���̾ƿ� �����ϱ�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setBackground(Color.BLACK);
		
		// container�� panel ���� ������Ű��!
		//container.add(panel1);
		
		//flowLayout();
		//gridLayout();
		//borderLayout();
		cardLayout();
		
		setSize(300, 200);
		setVisible(true);
	}
	
	// FlowLayout �����ϱ�
	public void flowLayout() {
		panel1.setLayout(new FlowLayout());
		panel1.add(button1);
		panel1.add(button2);
	}
	
	public void gridLayout() {
		panel1.setLayout(new GridLayout(2,2));
		panel1.add(button1);
		panel1.add(button2);
	}
	
	public void borderLayout() {
		panel1.setLayout(new BorderLayout());
		panel1.add(button1, BorderLayout.WEST);
		panel1.add(button2, BorderLayout.EAST);
	}
	
	//�̺�Ʈ �ڵ鷯�� �޾ƺ���!
	public void cardLayout() {
		final CardLayout card = new CardLayout();
		setLayout(card);
		
		label1.setFont(font);
		label1.setForeground(color);
		panel1.add(label1);
		panel1.add(button1);
		panel1.add(button2);
		
		panel2.add(label2);
		panel2.add(button3);
		panel2.add(button4);
		
		panel3.add(label3);
		panel3.add(button5);
		panel3.add(button6);
		
		//JFrame�� add ��Ű��
		add("p1", panel1);
		add("p2", panel2);
		add("p3", panel3);
		
		//�̺�Ʈ �ڵ鷯 �ޱ�(�̺�Ʈ ����, �ڵ鷯 �ٴ� ���)
		// �͸� Ŭ������ �̺�Ʈ ���鷯 �޾��ִ� ���
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();	//�̺�Ʈ �ҽ�
				
				if (btn.getText().equals("��ư1") ) {
					btn.setText("Action");
				} 
				else if(btn.getText().equals("Action")) {
					btn.setText("��ư1");
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(getContentPane());
			}
		});
		
		// button3 �� �׼� ---> ����Ŭ������ �ۼ��ϱ�
//		button3.addActionListener(new MyActionListener() {
//		});

		button3.addMouseListener(new MyMouseAdapter() {
		});
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(getContentPane());
			}
		});
		
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(getContentPane());
			}
		});
		
		button6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(getContentPane());
			}
		});
		
	}
	
	public static void main(String[] args) {
		SwingLayout layout = new SwingLayout();
	}

	//button3�� ������ ��ǥ�� �����ͼ� ��ư�� ���
	//MouseAdapter ���
	class MyMouseAdapter extends MouseAdapter{
		
		@Override
		public void mousePressed(MouseEvent e) {
			
			JButton btn = (JButton) e.getSource();	//�̺�Ʈ �ҽ�
			int x = e.getX();
			int y = e.getY();
			
			if (btn.getText().equals("��ư2") ) {
				btn.setText("��ǥ : (" + x + ", " + y + ")");
			} 
			else {
				btn.setText("��ư2");
			}
		}
	}
	
	
	
	
	//MyActionListener Ŭ���� ����
//	class MyActionListener implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton btn = (JButton) e.getSource();	//�̺�Ʈ �ҽ�
//			if (btn.getText().equals("��ư2") ) {
//				btn.setText("��ư�� ���������ϴ�.");
//			} 
//			else if(btn.getText().equals("��ư�� ���������ϴ�.")) {
//				btn.setText("��ư2");
//			}
//		}
//	}
	
	
	
}


