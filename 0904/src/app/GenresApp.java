package app;

import java.util.Scanner;
import org.apache.ibatis.session.SqlSession;
import util.SqlSessionUtil;

public class GenresApp {
	public static void main(String[] args) {
		System.out.println("장르를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String genreName = sc.nextLine();
		SqlSession session = SqlSessionUtil.getSession();
		int result = session.insert("genres.insert",genreName);
		System.out.println(result + "개 장르 입력 완료");
	} // main() end
} // GenresApp end
