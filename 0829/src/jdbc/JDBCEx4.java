package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx4 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner sc =  new Scanner(System.in);
		System.out.println("===아이돌 입력 프로그램===");
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("키를 입력해주세요");
		String height = sc.nextLine();
		System.out.println("몸무게를 입력해주세요");
		String weight = sc.nextLine();
		System.out.println("생년월일를 입력해주세요");
		String birth = sc.nextLine();
		System.out.println("ex) 2018-08-29");
		System.out.println("소속사를 입력해주세요");
		String ent = sc.nextLine();
		System.out.println("성별을 입력해주세요(숫자 선택)");
		System.out.println("1)남자, 2)여자");
		String gen = sc.nextLine();
		System.out.println("그룹을 입력해주세요");
		System.out.println("1)BTS 2)블랙핑크 3)레드벨벳 5)세븐틴");
		String group = sc.nextLine();
		if(gen.equals("1")) {
			gen="M";
		}
		else if(gen.equals("2")) {
			gen = "W";
		}
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(url, "test", "1111");
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO idols(idol_id, name, height, weight, birth_date, "
				+ "agent_name, gender, group_id) "
				+ "values(idols_seq.nextval,'"+name+"','"+height+"','"+weight
				+"','"+birth+"','"+ent+"','"+gen+"','"+group+"')";
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"개 입력");
	}
}
