package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class DBConnect {
	
	//0. JDBC Driver, URL, ID, PW 설정
	static String jdbcdriver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3305/mydb";		
	static String id = "root";									
	static String pw = "1234";								
	static Vector<Test> vtest = null;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Test t = null;
		vtest = new Vector<Test>();
		
		// 미션 1. 입력받은 값을 이름(name)과 이메일(email)로 분류하여 값을 나눠주세요.
		//Scanner scan = new Scanner(System.in);
		//System.out.print("이름, 이메일(콤마로 구분)>>");
		//String[] line = scan.nextLine().split(",");
		//t.setUname(line[0].trim());
		//t.setEmail(line[1].trim());
		
		// SQL문 정의
		String sql1 = "INSERT INTO TEST (UNAME, EMAIL) VALUES (?, ?)";
		
		// DB 연결에 필요한 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		//int n;
		
		//1. JDBC 드라이버 로드
		Class.forName(jdbcdriver);					//ClassNotFoundException
		
		//2. Connection 연결
		conn = DriverManager.getConnection(url, id, pw);
		
		//3. PreparedStatement 준비
		//pstmt = conn.prepareStatement(sql1);
		//pstmt.setString(1, t.getUname());
		//pstmt.setString(2, t.getEmail());
		
		
		//4. SQL 전송 : executeQuery()(조회)-ResultSet 타입, executeUpdate()(삽입, 삭제, 수정)-int 타입
		//n = pstmt.executeUpdate();
		
		//if( n < 1) {
		//	System.out.println("추가 실패");
		//}
		//else{
		//	System.out.println(n + "개의 record 추가됨");
		//	}
		
		//5. ResultSet으로 Transaction 처리
		String sql2 = "SELECT UNAME, EMAIL FROM TEST";
		pstmt = conn.prepareStatement(sql2);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			t = new Test();
			t.setUname(rs.getString("uname"));
			t.setEmail(rs.getString("email"));
			vtest.add(t);			
		}
		
		System.out.println(vtest.size() + "개의 데이터를 불러옵니다.");
		
		//6. Vector 내용 출력
		for (Test tt : vtest) {
			System.out.println(tt.getUname() + ", " + tt.getEmail());
		}
		
		pstmt.close();
		conn.close();	
			
	}
	
}


