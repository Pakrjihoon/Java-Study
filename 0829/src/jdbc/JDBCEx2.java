package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx2 {

	public static void main(String[] args) throws Exception {
		System.out.println("지울 그룹명을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String groupName = sc.nextLine();
		
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		String sql = "DELETE groups WHERE name = '"+groupName+"'";
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"개의 그룹이 삭제되었습니다.");

	}
}
