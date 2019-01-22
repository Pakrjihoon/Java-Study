package jdbc;

import java.awt.Transparency;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex2 {

	public static void main(String[] args) {
		// 2번 그룹의 이름을 BLACKPINK로 변경

		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "update groups set name = 'BLACKPINK' where group_id=2";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "test", "1111");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 수정 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	} // main() end
} // Ex2 end
