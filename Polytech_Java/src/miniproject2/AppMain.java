package miniproject2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AppMain extends JFrame implements ActionListener{
	// 화면 구성을 위해 필요한 패널
	JPanel p1 = new JPanel();	// 텍스트 라벨 패널
	JPanel p2 = new JPanel();	// 입력 양식 패널
	JPanel p3 = new JPanel();	// 데이터 출력 패널
	
	// 텍스트 라벨부
	JLabel msg1 = new JLabel();
	
	// 입력 양식 라벨부
	JLabel la1 = new JLabel("관리번호");
	JLabel la2 = new JLabel("상품명");
	JLabel la3 = new JLabel("단가");
	JLabel la4 = new JLabel("제조사");
	
	// 관리코드가 들어갈 콤보박스
	JComboBox cb = new JComboBox();
	
	// 입력 양식에 사용된 텍스트 필드
	JTextField t1 = new JTextField(20);	// 상품명
	JTextField t2 = new JTextField(20);	// 단가
	JTextField t3 = new JTextField(20);	// 제조사
	
	// 데이터 출력을 위한 텍스트 영역
	JTextArea ta = new JTextArea(10, 40);
	
	// 등록, 조회, 삭제 메뉴 버튼
	JButton b1 = new JButton("등록");
	JButton b2 = new JButton("조회");
	JButton b3 = new JButton("삭제");
	
	// editmode 설정(false : 등록/조회/삭제 불가)
	boolean editmode;
	
	// ProductDAO 를 위한 객체 설정
	ProductDAO dao = new ProductDAO();
	ArrayList<Product> datas = new ArrayList<Product>();
	Product product;
	JScrollPane scroll;
	
//--------------------------------------------------------------------------------------------------------------------------------------------
	
	
	public AppMain(){
		setTitle("상품 정보 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 400);
		setResizable(true);
		
		msg1.setText("프로그램이 시작되었습니다.");
		
		// 레이아웃 배치
		p1.setLayout(new GridLayout(4, 1, 20, 2));
		p2.setLayout(new GridLayout(4, 1, 20, 2));
		
		scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// refreshData 메소드 호출
		refreshData();
		
		// 각각의 등록(b1), 조회(b2), 삭제(b3) 버튼에 이벤트 리스너 추가
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
	
	// refresh : 초기화면 제공
	public void refreshData() {
		// 기존의 내용을 모두 지우고 초기화
		// textarea 초기화
		ta.setText("");
		t1.setText("");
		t2.setText("");
		t3.setText("");
		
		// editmode : true - 정보수정, 삭제, 전체목록 조회가 가능한 상태
		// editmode : false - 정보수정, 삭제, 전체목록 조회가 안되는 상태
		editmode = false;

		ta.append("관리번호 \t 상품명 \t\t 단가 \t 제조사 \n");
		
		// textarea 에 내용을 찍는 기능 구현
		datas = dao.getAll();

		// 콤보박스에 items 를 넣어주는 것
		cb.setModel(new DefaultComboBoxModel(dao.getItems() ) );
		
		if(datas!=null) {
			for (Product p : datas) {
				ta.append(p.toString() );
			}
		}
		else {
			ta.append("등록된 상품이 없습니다. \n상품을 등록해주세요.");
		}
		
	}
	
	// actionPerformed 오버라이딩
	// 이벤트 발생시 처리 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//등록 기능
		if(obj==b1) {
			product = new Product();
			product.setPrname(t1.getText().trim() );						// 상품명
			product.setPrice(Integer.parseInt(t2.getText().trim() ) );		// 단가
			product.setManufacture(t3.getText().trim() );					// 제조사
			
			// 수정인 경우
			if(editmode==true) {
				product.setPrcode(Integer.parseInt((String) cb.getSelectedItem() ) );
				if(dao.updateProduct(product)) {
					msg1.setText(cb.getSelectedItem() + "번의 상품 수정.");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					editmode = false;
				}
				else {
					msg1.setText("상품 수정 실패.");
				}
			}
			// 등록인 경우
			else {
				if(dao.newProduct(product)) {
					msg1.setText("상품이 등록.");
				}
				else {
					msg1.setText("상품 등록 실패.");
				}
			}
			// 화면 데이터 갱신
			refreshData();
		}
		
		//조회 기능
		if(obj==b2) {
			String item = (String) cb.getSelectedItem();
			if(item.equals("전체")) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				msg1.setText("전체 상품 조회.");
			}
			else {
				product = dao.getProduct(Integer.parseInt(item));
				if(product!=null) {
					t1.setText(product.getPrname());
					t2.setText(String.valueOf(product.getPrice() ) );
					t3.setText(product.getManufacture());
					editmode = true;
					msg1.setText(item + "번의 상품 조회.");
				}
				else {
					msg1.setText("상품 조회 실패.");
				}
			}
		}
		
		//삭제 기능
		if(obj==b3) {
			String item = (String) cb.getSelectedItem();
			if(item.equals("전체")) {
				msg1.setText("전체 삭제는 되지 않습니다.");
			}
			else {
				if(dao.delProduct(Integer.parseInt(item) ) ) {
					msg1.setText(item + "번의 상품 삭제");
				}
				else {
					msg1.setText("상품 삭제 실패.");
				}
			}
			refreshData();
		}
	}
	
	public static void main(String[] args) {
		AppMain app = new AppMain();
	}

	
}
