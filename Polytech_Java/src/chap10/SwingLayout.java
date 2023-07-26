package chap10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingLayout extends JFrame{

	JButton button1 = new JButton("버튼1");
	JButton button2 = new JButton("다음");
	JButton button3 = new JButton("버튼2");
	JButton button4 = new JButton("다음");
	JButton button5 = new JButton("이전");
	JButton button6 = new JButton("다음");
	
	Font font = new Font("맑은 고딕", Font.BOLD, 20);
	Color color = new Color(255,0,0);
	
	Label label1 = new Label("addActionListener구현");
	Label label2 = new Label("MouseAdapter");
	Label label3 = new Label("panel3");
	
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();
	
	public SwingLayout() {
		setTitle("스윙 레이아웃 연습하기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setBackground(Color.BLACK);
		
		// container에 panel 들을 부착시키자!
		//container.add(panel1);
		
		//flowLayout();
		//gridLayout();
		//borderLayout();
		cardLayout();
		
		setSize(300, 200);
		setVisible(true);
	}
	
	// FlowLayout 설정하기
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
	
	//이벤트 핸들러도 달아보자!
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
		
		//JFrame에 add 시키기
		add("p1", panel1);
		add("p2", panel2);
		add("p3", panel3);
		
		//이벤트 핸들러 달기(이벤트 종류, 핸들러 다는 방법)
		// 익명 클래스에 이벤트 랜들러 달아주는 방법
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();	//이벤트 소스
				
				if (btn.getText().equals("버튼1") ) {
					btn.setText("Action");
				} 
				else if(btn.getText().equals("Action")) {
					btn.setText("버튼1");
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(getContentPane());
			}
		});
		
		// button3 에 액션 ---> 내부클래스로 작성하기
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

	//button3을 누르면 좌표를 가져와서 버튼에 찍기
	//MouseAdapter 사용
	class MyMouseAdapter extends MouseAdapter{
		
		@Override
		public void mousePressed(MouseEvent e) {
			
			JButton btn = (JButton) e.getSource();	//이벤트 소스
			int x = e.getX();
			int y = e.getY();
			
			if (btn.getText().equals("버튼2") ) {
				btn.setText("좌표 : (" + x + ", " + y + ")");
			} 
			else {
				btn.setText("버튼2");
			}
		}
	}
	
	
	
	
	//MyActionListener 클래스 구현
//	class MyActionListener implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton btn = (JButton) e.getSource();	//이벤트 소스
//			if (btn.getText().equals("버튼2") ) {
//				btn.setText("버튼이 눌러졌습니다.");
//			} 
//			else if(btn.getText().equals("버튼이 눌러졌습니다.")) {
//				btn.setText("버튼2");
//			}
//		}
//	}
	
	
	
}


