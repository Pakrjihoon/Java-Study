package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제할 장르를 입력하세요");
		String removeGenre = sc.nextLine();
		String sql = "DELETE FROM genres where name = '"+removeGenre+"'";
		// delete from 구문을 사용하여 장르 테이블에 입력받은 genre를 삭제한다. (where 활용)
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "test", "1111");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result+ " 개의 장르가 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)
					stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(conn!=null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}// try~catch end
		} // try~catch~finally end
		
	} // main() end
} // Ex10 end
