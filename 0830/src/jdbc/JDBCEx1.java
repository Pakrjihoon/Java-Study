package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx1 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "test", "1111");
		Statement stmt = conn.createStatement();
		System.out.print("검색할 책의 키워드를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String bookName = sc.nextLine();
		String sql = "select * from books where title like '%"+bookName+"%'";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("no")+") 제목 : "+rs.getString("title")
			+" /저자 : "+rs.getString("author")+" /출판사 : "+
			rs.getString("publisher")+" /출판일 : "+rs.getDate("publication_date"));
		}
	}
}
