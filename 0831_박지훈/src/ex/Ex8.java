package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner sc = new Scanner(System.in);
		
		// Scanner 객체를 이용하여 입력을 받을 수 있다.
		System.out.println("추가할 장르를 입력하세요");
		String addGenre = sc.nextLine();
		String sql = "INSERT INTO genres(no, name) "
				+ "VALUES(genres_seq.nextval, '"+addGenre+"')";
		// Insert into 구문은 해당 테이블 내부에 값을 넣어줄 수있다. 
		// sequence를 이용하여 no는 이전 숫자의 다음 숫자로 자동 기입을 해준다.
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "test", "1111");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result+ " 개의 장르가 입력되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)
					stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}// try~catch end
			try {
				if(conn!=null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}// try~catch end
		}// try~catch~finally end
		
	} // main() end
} //Ex8 end 
