package jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import util.StatementUtil;

public class JDBCEx3 {
	public static void main(String[] args) throws Exception{
		Statement stmt = StatementUtil.getStatement();
		String sql = "select idol_id, name from idols order by 1";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+") "+rs.getString("name")+"  ");
		}
		System.out.println("\n삭제할 아이돌 번호를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		String idolNumber = sc.nextLine();
		sql = "delete from idols where idol_id = '"+ idolNumber+"'";
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result +" 개 삭제되었습니다.");
		String sql2 = "select name from idols where idol_id = '"+idolNumber+"'";
		ResultSet rs2 = stmt.executeQuery(sql2);
		while(rs2.next()==false) {
			System.out.println(rs2.getString(2));
		}
	}
}
