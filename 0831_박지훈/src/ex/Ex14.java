//package ex;

//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class Ex14 {
//	public static void main(String[] args) {
//		Connection conn = null;
//		Statement stmt = null;
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("* 영화입력 프로그램 *");
//		String sql = "SELECT * FROM genres ";
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			conn = DriverManager.getConnection(url, "test", "1111");
//			stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				System.out.print(rs.getInt(1)+") "+rs.getString(2)+"  ");
//			}
//			System.out.println();
//			while(true) {
//				System.out.println("장르번호를 입력해주세요.");
//				String genreNum = sc.nextLine();
//				
//				System.out.println("영화 이름을 입력해주세요.");
//				String movieName = sc.nextLine();
//				
//				System.out.println("감독이름을 입력해주세요.");
//				String directorName = sc.nextLine();
//				
//				System.out.println("아래와 같은 포맷으로 개봉일을 입력해주세요");
//				System.out.println("Ex) 2018-08-31 (년-월-일)");
//				String relDate = sc.nextLine();
//				
//				System.out.println("아래와 같은 포맷으로 종료일을 입력해주세요");
//				System.out.println("Ex) 2018-08-31 (년-월-일)");
//				System.out.println("현재 상영중으로 종료일이 없으면 엔터를 입력하세요");
//				String endDate = sc.nextLine();
//				
//				System.out.println("관객수를 입력해주세요.(없으면 그냥 엔터)");
//				String view = sc.nextLine();
//				
//				String sql2 = "INSERT INTO movies(no, name, release_date, end_date, director, audience_num, genre) "
//						+ "VALUES(movies_seq.nextval, '"+ movieName+"','"+relDate+"','"+endDate+"','"+
//						directorName+"','"+view+"','"+genreNum+"')";
//				int result = stmt.executeUpdate(sql2);
//				System.out.println(result+"개 영화가 등록되었습니다.");
//				
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(stmt!=null)
//					stmt.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//			} // try~ catch end
//			try {
//				if(conn!=null)
//					conn.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//			} //try~catch end
//		} // try~catch~finally end
//	} // main() end
//} // Ex14 end


// 위 코드는 가산점을 제외한 코드 입니다.

// 가산점을 받기 위해 새로이 작성을 해보았는데, 날짜를 입력받는 Date형식 format 부분을
// 구현못하였고, 감독과 영화 이름 , 장르만 가산점 구현 했습니다. 
package ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String genreNum;
		String movieName;
		String directorName;
		String relDate;
		String endDate;
		String view ;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("* 영화입력 프로그램 *");
		String sql = "SELECT * FROM genres ";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "test", "1111");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt(1)+") "+rs.getString(2)+"  ");
			}
			System.out.println();
			while(true) {
				try {
					// 장르 번호를 입력받기 위한 구문 
					// 장르 번호를 문자열 즉 String 혹은 char 형식으로
					// 입력을 할 경우에는 catch 구문 실행 후 
					//while을 통하여 다시 반복합니다.
					int genreN;
					int viewN;
					System.out.println("장르번호를 입력해주세요.");
					genreNum = sc.nextLine();
					genreN = Integer.parseInt(genreNum);
					
					// 영화이름을 입력 받는 구문입니다.
					// length 메서드를 통해 길이를 구하고
					// 만약 입력값이 공백이 아닐 경우만 break;로 while문을 넘어갑니다.
					while(true){
						System.out.println("영화 이름을 입력해주세요.");
						movieName = sc.nextLine();
						if(movieName.length()!=0)
							break; 
					} //while end
					
					// 감독이름 역시 영화 이름을 입력받는
					// 구문이랑 동일한 조건을 갖습니다.
					while(true) {
						System.out.println("감독이름을 입력해주세요.");
						directorName = sc.nextLine();
						if(directorName.length() != 0)
							break;
					} // while end
					System.out.println("아래와 같은 포맷으로 개봉일을 입력해주세요");
					System.out.println("Ex) 2018-08-31 (년-월-일)");
					relDate = sc.nextLine();
						
					System.out.println("아래와 같은 포맷으로 종료일을 입력해주세요");
					System.out.println("Ex) 2018-08-31 (년-월-일)");
					System.out.println("현재 상영중으로 종료일이 없으면 엔터를 입력하세요");
					endDate = sc.nextLine();
					if(endDate.length()==0)
						endDate = null;
					System.out.println("관객수를 입력해주세요.(없으면 그냥 엔터)");
					view = sc.nextLine();
					if (view.length()==0) {
						view = "0";
						Integer.parseInt(view);
					}// if end
					String sql2 = "INSERT INTO movies(no, name, release_date, end_date, director, audience_num, genre) "
							+ "VALUES(movies_seq.nextval, '"+ movieName+"','"+relDate+"','"+endDate+"','"+
							directorName+"','"+view+"','"+genreNum+"')";
					int result = stmt.executeUpdate(sql2);
					System.out.println(result+"개 영화가 등록되었습니다.");	
					} catch (Exception e) {
					System.out.println("정확한 번호를 입력해주세요.");
				}
			} // while end
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)
					stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			} // try~ catch end
			try {
				if(conn!=null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			} //try~catch end
		} // try~catch~finally end
	} // main() end
} // Ex14 end