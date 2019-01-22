package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 장르번호를 입력하세요.");
		String correctGenreNumber = sc.nextLine();
		System.out.println("변경될 장르명을 입력하세요.");
		String correctGenre = sc.nextLine();
		String sql = "UPDATE genres set name = '"+correctGenre+"' "
				+ "where no = '"+correctGenreNumber+"'";
		// 장르명을 바꾸기 위해  번호와 명을 받는 객체자료형 변수 String 을 선언하여
		// 해당 변수에 값을 받아서 수정을 할 수있는 update set 구문을 활용한다.
		// 조건식 where 은 입력받은 번호에 해당 장르 이름을 변경한다.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "test", "1111");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result+ " 개의 장르명이 잘 변경되었습니다.");
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
			} // try~catch end
		}// try~catch~finally end
	} // main() end
}// Ex09 end
