package app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Genre;

public class MyBatisSelectApp {
	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSession();
		
		/*
		 * insert : insert된 행 갯수 반환
		 * update : update된 행 갯수 반환
		 * delete : delete된 행 갯수 반환
		 * 
		 * selectOn() : 객체 한개 반환
		 * selectList() : List로 반환
		 */
		List<Genre> genres = session.selectList("genres.selectList");
		
		for(Genre genre: genres) {
			System.out.println(genre);
			// toString을 오버라이딩 해서 사용
		}
		
	}
}
