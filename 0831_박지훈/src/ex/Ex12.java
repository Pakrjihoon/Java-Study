package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "SELECT * FROM movies ";
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "test", "1111");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
				int cnt = 0;
				for(int i=0; i<25; i++) {
					while(rs.next()) {
					System.out.print(rs.getInt(1)+") "+rs.getString(2)+"  ");
					cnt++;
					if(cnt%4==0)
						System.out.println();
				}
					//4개씩 출력을 위하여 cnt 변수를 0으로 초기화해주고 
					// 총 25개의 영화가 존재하니 0부터 25까지 for문을 사용
					// 후에 while문에서는 반복을 하면서 cnt 값을 1씩증가시켜주며,
					// 4로 나눴을때 나머지가 0이면 줄바꿈을 할 수있도록 합니다. 
			}
			System.out.println("\n삭제할 영화번호는? ");
			String deleteMovieNumber = sc.nextLine();
			String sql2 = "DELETE FROM movies where no = '"+deleteMovieNumber+"'";
			// 삭제할 영화 번호를 입력받는 구문이다. 해당 번호를 입력받으면 delete from 을 사용하여 해당되는 영화 번호의
			// 영화를 삭제합니다.
			
			// 삭제할 영화가 존해자는 result 가 만약 0 이 아닐시에는 삭제가 되었다는 구문, 
			// 영화가 만약 존재하지 않는다면 , 삭제되지 않았다는 구문을 출력합니다.
			int result = stmt.executeUpdate(sql2);
			if (result==0) {
				System.out.println("삭제되지 않았습니다.");
			}else {
				System.out.println(result+"개의 영화가 삭제되었습니다.");
			} // if~else end
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
		
	}// main() end
} // Ex12 end