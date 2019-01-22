package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 영화제목을 입력해주세요.");
		String searchTitle = sc.nextLine();
		String sql = "SELECT no, name, director, to_char(release_date,'yyyy')||'년 '||"
				+ "to_char(release_date,'mm')||'월 '||to_char(release_date,'dd')||'일'"
				+ ", to_char(audience_num,'999,999,999')||'명'"
				+ ", genre FROM movies where name like '%"+searchTitle+"%'"
						+ " order by 6";
		// sql구문에서 format을 지정하기 위하여 구문이 길었습니다.
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "test", "1111");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			// if문 내부에 같은 구문을 사용한 이유는
			// while 문에서 rs.next()를 거치면 if문에서 사용한 rs.next의 그 다음을 탐색하기에
			// 다음을 탐색하기 전에 해당 조건에 만족하는 구문을 출력하기 위함입니다.
			if(rs.next()) {
				System.out.println(rs.getInt(1)+") "+rs.getString(2)+" / 감독 : "+
					rs.getString(3)+" / 개봉일 : "+rs.getString(4) + " / 관객수 : "
					+rs.getString(5)+" / 장르 : "+rs.getInt(6));
				while(rs.next()) {
				System.out.println(rs.getInt(1)+") "+rs.getString(2)+" / 감독 : "+
			rs.getString(3)+" / 개봉일 : "+rs.getString(4) + " / 관객수 : "
			+rs.getString(5)+" / 장르 : "+rs.getInt(6));
				} // while end
			}
			else {
				System.out.println("검색된 영화가 없습니다.");
			} // if~ else end
			
			
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
			} // try~catch end
		} // try~catch~finally end
		
	} // main() end
} // Ex13 end 

