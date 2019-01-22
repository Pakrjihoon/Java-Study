package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCEx1 {

	public static void main(String[] args) throws Exception{
		
		// 1) JDBC 드라이버를 메모리에 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 로딩 완료");
		
		// 1.9 url , user, password 설정
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		
		// 2) 커넥션 객체 생성
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("커넥션 완료");
		
		// 3) Statement 구문객체 생성
		Statement stmt = conn.createStatement();
		
		// 4) SQL 구문 작성
		String sql = "DELETE groups " + "WHERE group_id = 15";
		
		// 5) 수행후 결과행 갯수 반환
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"행 삭제완료");
		
	} //main() end

} //JDBCEx1 end
