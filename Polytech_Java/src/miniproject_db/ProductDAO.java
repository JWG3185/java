package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	
	// JDBC Driver, URL, ID, PW 설정
	String jdbcdriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3305/mydb";		
	String id = "root";									
	String pw = "1234";								
	ArrayList<Product> product_list = null;
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Product p;
	String sql;
	
	//1. DB 연결 메소드
	public void connectDB() throws ClassNotFoundException, SQLException{
		Class.forName(jdbcdriver);
		conn = DriverManager.getConnection(url, id, pw);
	}
	
	//2. DB 종료 메소드
	public void closeDB() throws SQLException{
		pstmt.close();
		conn.close();
	}
	
	//3. 전체 조회 (전체 Product 리스트로 구성된 ArrayList를 리턴)
	public ArrayList<Product> getAll() {
		
		
		return product_list;
	}
	
	//4. 일부 조회 (파라미터에서 pcode에 해당하는 상품을 리턴)
	public Product getProduct(int pcode) throws Exception {
		
		//1. DB 연결
		connectDB();
		
		sql = "select * from product where pcode = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pcode);
		rs = pstmt.executeQuery();
		rs.next();
		
		//todo : CellPhone 또는 SmartTV로 분류해서 값을 넣어줘야함.
		p = new SmartTV();
		p = new CellPhone();
		
		p.setPcode(rs.getInt("pcode"));
		p.setPname(rs.getString("pname"));
		p.setPrice(rs.getInt("price"));
		p.setMf(rs.getString("mf"));
		
		//3. DB 종료
		closeDB();
		
		return p;
		
	}
	
	//5. insert (Product의 객체 내용을 DB에 저장)
	public int newProduct(Product product) throws ClassNotFoundException, SQLException {
		
		//1. DB 연결
		connectDB();
		
		//2. pstmt에 sql을 활용, executeUpdate 메소드 활용하여 insert
		sql = "insert into product(pname, price, mf) values (?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getPname() );
		pstmt.setInt(2, product.getPrice() );
		pstmt.setString(3, product.getMf() );
		int n = pstmt.executeUpdate();
		
		//3. DB 종료
		closeDB();
		
		return n;
	}
	
	//6. delete (Product의 객체에서 pcode에 해당하는 객체를 DB에서 삭제)
	public int deleteProduct(int pcode) throws ClassNotFoundException, SQLException {
		
		//1. DB 연결
		connectDB();
		
		//2. pstmt에 sql을 활용, executeUpdate 메소드 활용하여 delete
		sql = "delete from product where pcode = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pcode);
		int n = pstmt.executeUpdate();
		
		//3. DB 종료
		closeDB();
		
		return n;
	}
	
	//7. update (Product의 객체 내용을 업데이트)
	public int updateProduct(Product product) throws ClassNotFoundException, SQLException {
		
		//1. DB 연결
		connectDB();
		
		//2. pstmt에 sql을 활용, executeUpdate 메소드 활용하여 insert
		sql = "update product set pname=?, price=?, mf=? where pcode=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getPname() );
		pstmt.setInt(2, product.getPrice() );
		pstmt.setString(3, product.getMf() );
		pstmt.setInt(4, product.getPcode() );
		int n = pstmt.executeUpdate();
		
		//3. DB 종료
		closeDB();
		
		return n;
		
	}
	
}
