package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "select * from groups order by 1";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "test", "1111");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+") "+rs.getString(2));
			}
			System.out.println("장르번호를 입력해주세요.");
			String genreNum = sc.nextLine();
			
			System.out.println("영화 이름을 입력해주세요.");
			String movieName = sc.nextLine();
			
			System.out.println("감독이름을 입력해주세요.");
			String directorName = sc.nextLine();
			System.out.println("아래와 같은 포맷으로 개봉일을 입력해주세요");
			System.out.println("Ex) 2018-08-31 (년-월-일)");
			String relDate = sc.nextLine();
			
			System.out.println("아래와 같은 포맷으로 종료일을 입력해주세요");
			System.out.println("Ex) 2018-08-31 (년-월-일)");
			System.out.println("현재 상영중으로 종료일이 없으면 엔터를 입력하세요");
			String endDate = sc.nextLine();
			
			System.out.println("관객수를 입력해주세요.(없으면 그냥 엔터)");
			String view = sc.nextLine();
			
			String sql2 = "INSERT INTO movies(no, name, release_date, end_date, director, audience_num, genre "
					+ "VALUES('movies_seq.nextval, '"+ movieName+"','"+relDate+"','"+endDate+"','"+
					directorName+"','"+view+"','"+genreNum+"')";
			int result = stmt.executeUpdate(sql2);
			System.out.println(result+"개 영화가 등록되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if(stmt!=null) stmt.close(); } catch(Exception e2) {}
			try { if(conn!=null) conn.close(); } catch(Exception e2) {}
		} // try~catch~finally end
	} // main() end
} // Ex3 end
