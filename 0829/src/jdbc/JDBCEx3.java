package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx3 {

	public static void main(String[] args) throws Exception{
		System.out.println("+++ 그룹입력앱 +++");
		System.out.println("그룹명을 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("데뷔일을 입력하세요.");
		System.out.println("ex) 2018-08-28");
		String debutDate = sc.nextLine();
		
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO groups(group_id, name,debut_date)"
				+ " VALUES(groups_seq.nextval,'"+name+"','"+debutDate+"')";
		int result = stmt.executeUpdate(sql);
		System.out.println(result+ "개 입력");
	

	}

}
