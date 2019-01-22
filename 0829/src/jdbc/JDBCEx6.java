package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCEx6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("출력");
		
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "test", "1111");
		Statement stmt = conn.createStatement();
		String sql = "select i.name, height, weight,"
				+ "agent_name, gender, g.name from idols i , groups g where"
				+ " i.group_id=g.group_id";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String gender = 
			rs.getString("gender").equals("W")? "여자": "남자";
			System.out.println("이름 : "+rs.getString("name")+" / 키 : "+
		rs.getInt("height")+"cm / 몸무게 : "+rs.getInt("weight")+ "kg / 소속사 : "
		+ rs.getString("agent_name")+" / 성별 : "+gender+
		" 그룹명 : "+ rs.getString(6));
		}
	}

}
