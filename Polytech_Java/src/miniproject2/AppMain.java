package miniproject2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AppMain extends JFrame implements ActionListener{
	// ȭ�� ������ ���� �ʿ��� �г�
	JPanel p1 = new JPanel();	// �ؽ�Ʈ �� �г�
	JPanel p2 = new JPanel();	// �Է� ��� �г�
	JPanel p3 = new JPanel();	// ������ ��� �г�
	
	// �ؽ�Ʈ �󺧺�
	JLabel msg1 = new JLabel();
	
	// �Է� ��� �󺧺�
	JLabel la1 = new JLabel("������ȣ");
	JLabel la2 = new JLabel("��ǰ��");
	JLabel la3 = new JLabel("�ܰ�");
	JLabel la4 = new JLabel("������");
	
	// �����ڵ尡 �� �޺��ڽ�
	JComboBox cb = new JComboBox();
	
	// �Է� ��Ŀ� ���� �ؽ�Ʈ �ʵ�
	JTextField t1 = new JTextField(20);	// ��ǰ��
	JTextField t2 = new JTextField(20);	// �ܰ�
	JTextField t3 = new JTextField(20);	// ������
	
	// ������ ����� ���� �ؽ�Ʈ ����
	JTextArea ta = new JTextArea(10, 40);
	
	// ���, ��ȸ, ���� �޴� ��ư
	JButton b1 = new JButton("���");
	JButton b2 = new JButton("��ȸ");
	JButton b3 = new JButton("����");
	
	// editmode ����(false : ���/��ȸ/���� �Ұ�)
	boolean editmode;
	
	// ProductDAO �� ���� ��ü ����
	ProductDAO dao = new ProductDAO();
	ArrayList<Product> datas = new ArrayList<Product>();
	Product product;
	JScrollPane scroll;
	
//--------------------------------------------------------------------------------------------------------------------------------------------
	
	
	public AppMain(){
		setTitle("��ǰ ���� ���α׷�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 400);
		setResizable(true);
		
		msg1.setText("���α׷��� ���۵Ǿ����ϴ�.");
		
		// ���̾ƿ� ��ġ
		p1.setLayout(new GridLayout(4, 1, 20, 2));
		p2.setLayout(new GridLayout(4, 1, 20, 2));
		
		scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// refreshData �޼ҵ� ȣ��
		refreshData();
		
		// ������ ���(b1), ��ȸ(b2), ����(b3) ��ư�� �̺�Ʈ ������ �߰�
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		
		p1.add(la1);
		p1.add(la2);
		p1.add(la3);
		p1.add(la4);
		
		p2.add(cb);
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		
		add(msg1, BorderLayout.PAGE_START);
		add(p1, BorderLayout.LINE_START);
		add(p2, BorderLayout.CENTER);
		add(scroll, BorderLayout.LINE_END);
		add(p3, BorderLayout.PAGE_END);
		
		setVisible(true);
	
	}
	
	// refresh : �ʱ�ȭ�� ����
	public void refreshData() {
		// ������ ������ ��� ����� �ʱ�ȭ
		// textarea �ʱ�ȭ
		ta.setText("");
		t1.setText("");
		t2.setText("");
		t3.setText("");
		
		// editmode : true - ��������, ����, ��ü��� ��ȸ�� ������ ����
		// editmode : false - ��������, ����, ��ü��� ��ȸ�� �ȵǴ� ����
		editmode = false;

		ta.append("������ȣ \t ��ǰ�� \t\t �ܰ� \t ������ \n");
		
		// textarea �� ������ ��� ��� ����
		datas = dao.getAll();

		// �޺��ڽ��� items �� �־��ִ� ��
		cb.setModel(new DefaultComboBoxModel(dao.getItems() ) );
		
		if(datas!=null) {
			for (Product p : datas) {
				ta.append(p.toString() );
			}
		}
		else {
			ta.append("��ϵ� ��ǰ�� �����ϴ�. \n��ǰ�� ������ּ���.");
		}
		
	}
	
	// actionPerformed �������̵�
	// �̺�Ʈ �߻��� ó�� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//��� ���
		if(obj==b1) {
			product = new Product();
			product.setPrname(t1.getText().trim() );						// ��ǰ��
			product.setPrice(Integer.parseInt(t2.getText().trim() ) );		// �ܰ�
			product.setManufacture(t3.getText().trim() );					// ������
			
			// ������ ���
			if(editmode==true) {
				product.setPrcode(Integer.parseInt((String) cb.getSelectedItem() ) );
				if(dao.updateProduct(product)) {
					msg1.setText(cb.getSelectedItem() + "���� ��ǰ ����.");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					editmode = false;
				}
				else {
					msg1.setText("��ǰ ���� ����.");
				}
			}
			// ����� ���
			else {
				if(dao.newProduct(product)) {
					msg1.setText("��ǰ�� ���.");
				}
				else {
					msg1.setText("��ǰ ��� ����.");
				}
			}
			// ȭ�� ������ ����
			refreshData();
		}
		
		//��ȸ ���
		if(obj==b2) {
			String item = (String) cb.getSelectedItem();
			if(item.equals("��ü")) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				msg1.setText("��ü ��ǰ ��ȸ.");
			}
			else {
				product = dao.getProduct(Integer.parseInt(item));
				if(product!=null) {
					t1.setText(product.getPrname());
					t2.setText(String.valueOf(product.getPrice() ) );
					t3.setText(product.getManufacture());
					editmode = true;
					msg1.setText(item + "���� ��ǰ ��ȸ.");
				}
				else {
					msg1.setText("��ǰ ��ȸ ����.");
				}
			}
		}
		
		//���� ���
		if(obj==b3) {
			String item = (String) cb.getSelectedItem();
			if(item.equals("��ü")) {
				msg1.setText("��ü ������ ���� �ʽ��ϴ�.");
			}
			else {
				if(dao.delProduct(Integer.parseInt(item) ) ) {
					msg1.setText(item + "���� ��ǰ ����");
				}
				else {
					msg1.setText("��ǰ ���� ����.");
				}
			}
			refreshData();
		}
	}
	
	public static void main(String[] args) {
		AppMain app = new AppMain();
	}

	
}
