package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	
	// JDBC Driver, URL, ID, PW ����
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
	
	//1. DB ���� �޼ҵ�
	public void connectDB() throws ClassNotFoundException, SQLException{
		Class.forName(jdbcdriver);
		conn = DriverManager.getConnection(url, id, pw);
	}
	
	//2. DB ���� �޼ҵ�
	public void closeDB() throws SQLException{
		pstmt.close();
		conn.close();
	}
	
	//3. ��ü ��ȸ (��ü Product ����Ʈ�� ������ ArrayList�� ����)
	public ArrayList<Product> getAll() {
		
		
		return product_list;
	}
	
	//4. �Ϻ� ��ȸ (�Ķ���Ϳ��� pcode�� �ش��ϴ� ��ǰ�� ����)
	public Product getProduct(int pcode) throws Exception {
		
		//1. DB ����
		connectDB();
		
		sql = "select * from product where pcode = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pcode);
		rs = pstmt.executeQuery();
		rs.next();
		
		//todo : CellPhone �Ǵ� SmartTV�� �з��ؼ� ���� �־������.
		p = new SmartTV();
		p = new CellPhone();
		
		p.setPcode(rs.getInt("pcode"));
		p.setPname(rs.getString("pname"));
		p.setPrice(rs.getInt("price"));
		p.setMf(rs.getString("mf"));
		
		//3. DB ����
		closeDB();
		
		return p;
		
	}
	
	//5. insert (Product�� ��ü ������ DB�� ����)
	public int newProduct(Product product) throws ClassNotFoundException, SQLException {
		
		//1. DB ����
		connectDB();
		
		//2. pstmt�� sql�� Ȱ��, executeUpdate �޼ҵ� Ȱ���Ͽ� insert
		sql = "insert into product(pname, price, mf) values (?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getPname() );
		pstmt.setInt(2, product.getPrice() );
		pstmt.setString(3, product.getMf() );
		int n = pstmt.executeUpdate();
		
		//3. DB ����
		closeDB();
		
		return n;
	}
	
	//6. delete (Product�� ��ü���� pcode�� �ش��ϴ� ��ü�� DB���� ����)
	public int deleteProduct(int pcode) throws ClassNotFoundException, SQLException {
		
		//1. DB ����
		connectDB();
		
		//2. pstmt�� sql�� Ȱ��, executeUpdate �޼ҵ� Ȱ���Ͽ� delete
		sql = "delete from product where pcode = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pcode);
		int n = pstmt.executeUpdate();
		
		//3. DB ����
		closeDB();
		
		return n;
	}
	
	//7. update (Product�� ��ü ������ ������Ʈ)
	public int updateProduct(Product product) throws ClassNotFoundException, SQLException {
		
		//1. DB ����
		connectDB();
		
		//2. pstmt�� sql�� Ȱ��, executeUpdate �޼ҵ� Ȱ���Ͽ� insert
		sql = "update product set pname=?, price=?, mf=? where pcode=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getPname() );
		pstmt.setInt(2, product.getPrice() );
		pstmt.setString(3, product.getMf() );
		pstmt.setInt(4, product.getPcode() );
		int n = pstmt.executeUpdate();
		
		//3. DB ����
		closeDB();
		
		return n;
		
	}
	
}
