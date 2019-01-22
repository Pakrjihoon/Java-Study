package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementUtil {
	public static Statement getStatement() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn.createStatement();
	}
}
