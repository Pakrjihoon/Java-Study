package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner sc = new Scanner(System.in);
		
		// a를 입력하면 이름중에 a가 들어간 사원들 전부 출력
		System.out.print("이름의 키워드를 입력하세요 : ");
		String keyword = sc.nextLine();
		String sql = "select * from employees where last_name like '%"+keyword+"%' or "
				+ "first_name like '%"+keyword+"'";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "1111");
			stmt  = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+") "+ rs.getString(2)+" "+rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} // try~catch~finally end
	} // main() end

} // Ex4 end
