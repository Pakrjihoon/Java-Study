package app;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class MybatisApp {
	public static void main(String[] args) throws Exception {
		
		// 1) mybatis-config.xml을 읽어옴
		//Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml"); 
		
		// SqlSessionFactoryBuilder
		
		// 2) SqlSessionFactory
		//SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		
		// 위 코드를 Util로 나누어서 코드의 재사용성 및 가독성을 높인다.
		
		
		// 3) SqlSession 열기
		SqlSession session = SqlSessionUtil.getSession();
		
		// 4) 구문수행
		int result = session.delete("movies.delete",25);
		// delete 괄호 안에는 '네임스페이스.아이디'를 입력한다.
		System.out.println(result+"개 삭제");
		
		session.close();
	} // main() end
} // MybatisApp end
