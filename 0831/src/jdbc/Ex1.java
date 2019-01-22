package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex1 {

	public static void main(String[] args) {
		/* 
		 * insert, update, delete 구문 
		 * - Connection, Statement 이 필요
		 * 
		 * select 구문 
		 * - Connection, Statement, ResultSet 이 필요
		 * 
		 *  1) 객체 선언
		 *  2) try~catch~finally 구문 생성
		 *  3) finally 구문 작성
		 */
		//1) 객체 선언
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "DELETE groups WHERE group_id = 17";
		//2) try~catch~finally 구문 생성
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(url, "test", "1111");
		
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result+"개 그룹 삭제");
			
		} catch (Exception e) {
			// 디버깅용
			e.printStackTrace();
		} finally {
			
			// 3) finally 구문 작성
			try {
				// conn 이 try~catch에서 에러 발생시
				// stmt 는 null 값이므로 if문이 없으면
				// NullPointException 발생
				if(stmt!=null) {
					stmt.close();
				}
			} catch(Exception e) {
				
			}
			
			try {
				if(conn !=null) {
					conn.close();
				}
			} catch (Exception e2) {
				
			}
				
			
		} // try~catch~finally 작성
			
	}
}

