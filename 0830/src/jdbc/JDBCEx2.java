package jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import util.StatementUtil;

public class JDBCEx2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		//import를 해주었으므로 바로 Statement를 얻어올 수 있다.
		Statement stmt = StatementUtil.getStatement();
		
		while(true) {
			System.out.print("수정할 책 번호는 ?");
			String number = sc.nextLine();
			String sql = "select title from books where no = '"+number+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("이전 책 제목은 : " + rs.getString("title")+" 입니다");
				System.out.println("변경될 책 이름을 입력해주세요.");
				String afterTitle = sc2.nextLine();
				String sql2 = "update books set title = '"+afterTitle+"'"
							+ " where no = '"+number+"'";
				int result = stmt.executeUpdate(sql2);
				System.out.println(result+"개 수정 완료");
				System.out.println("수정된 책 제목 : "+afterTitle+"\n");
			} else {
				System.out.println("존재 하지 않는 도서");
			}
		}
	}
}
