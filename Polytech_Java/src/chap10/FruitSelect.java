package chap10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FruitSelect extends JFrame{

	String fruit[] = {"사과", "귤", "딸기", "포도", "수박"};
	JButton button1 = new JButton("<<");
	JButton button2 = new JButton(">>");
	JButton button3 = new JButton(fruit[0]);
	int index = 0;
	
	public FruitSelect() {
		setTitle("과일 고르기 GUI 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		setLayout(new BorderLayout());
		
		button3.setBackground(Color.LIGHT_GRAY);
		
		button1.addMouseListener(new Select());
		button2.addMouseListener(new Select());
		
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.CENTER);
		
	}
	
	class Select extends MouseAdapter{
			
		@Override
		public void mousePressed(MouseEvent e) {
			
			JButton btn = (JButton) e.getSource();
		
			if (btn == button1 ) {
				index--;
				if (index <= 0) {index = 0;}
			} 
			else {
				index++;
				if(index >= fruit.length) {index = fruit.length - 1;}
			}
			
			button3.setText(fruit[index]);
		}
		
	}
	
	public static void main(String[] args) {
		FruitSelect fruit = new FruitSelect();
	}
}
