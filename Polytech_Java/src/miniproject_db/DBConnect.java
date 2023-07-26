package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class DBConnect {
	
	//0. JDBC Driver, URL, ID, PW ����
	static String jdbcdriver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3305/mydb";		
	static String id = "root";									
	static String pw = "1234";								
	static Vector<Test> vtest = null;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Test t = null;
		vtest = new Vector<Test>();
		
		// �̼� 1. �Է¹��� ���� �̸�(name)�� �̸���(email)�� �з��Ͽ� ���� �����ּ���.
		//Scanner scan = new Scanner(System.in);
		//System.out.print("�̸�, �̸���(�޸��� ����)>>");
		//String[] line = scan.nextLine().split(",");
		//t.setUname(line[0].trim());
		//t.setEmail(line[1].trim());
		
		// SQL�� ����
		String sql1 = "INSERT INTO TEST (UNAME, EMAIL) VALUES (?, ?)";
		
		// DB ���ῡ �ʿ��� ��ü ����
		Connection conn = null;
		PreparedStatement pstmt = null;
		//int n;
		
		//1. JDBC ����̹� �ε�
		Class.forName(jdbcdriver);					//ClassNotFoundException
		
		//2. Connection ����
		conn = DriverManager.getConnection(url, id, pw);
		
		//3. PreparedStatement �غ�
		//pstmt = conn.prepareStatement(sql1);
		//pstmt.setString(1, t.getUname());
		//pstmt.setString(2, t.getEmail());
		
		
		//4. SQL ���� : executeQuery()(��ȸ)-ResultSet Ÿ��, executeUpdate()(����, ����, ����)-int Ÿ��
		//n = pstmt.executeUpdate();
		
		//if( n < 1) {
		//	System.out.println("�߰� ����");
		//}
		//else{
		//	System.out.println(n + "���� record �߰���");
		//	}
		
		//5. ResultSet���� Transaction ó��
		String sql2 = "SELECT UNAME, EMAIL FROM TEST";
		pstmt = conn.prepareStatement(sql2);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			t = new Test();
			t.setUname(rs.getString("uname"));
			t.setEmail(rs.getString("email"));
			vtest.add(t);			
		}
		
		System.out.println(vtest.size() + "���� �����͸� �ҷ��ɴϴ�.");
		
		//6. Vector ���� ���
		for (Test tt : vtest) {
			System.out.println(tt.getUname() + ", " + tt.getEmail());
		}
		
		pstmt.close();
		conn.close();	
			
	}
	
}


