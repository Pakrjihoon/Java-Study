package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;

public class JDBCEx5 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(url, "hr", "1111");
		Statement stmt = conn.createStatement();
		//Statement 인터페이스의 추상 메서드
		String sql = "SELECT * FROM employees";
		
		//SQL 구문 수행후 결과집합 얻기
		ResultSet rs = stmt.executeQuery(sql);
		//ResultSet의 추상메서드
		// next() : 실행결과가 있으면 true
		//					   없으면 false
		
		//executeUpdate(sql) : 갯수(int) 리턴
		// - insert, update, delete 구문
		//executeQuery(sql) : ResultSet 리턴
		// - select 구문
		while(rs.next()) {
			System.out.println("사번 : "+rs.getInt(1)+" / 성명 : "+ rs.getString(2));
		} // while end
	}
	

}
