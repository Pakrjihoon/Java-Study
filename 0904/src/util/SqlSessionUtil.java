package util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	public static SqlSession getSession() {
		// 메서드를 FM으로 만드는 방법
		// 리턴 자료형과 같은 객체를 null 로 초기화후 
		// 그 값을 리턴해준다.
		SqlSession session = null;
		
		try {
			// 1) mybatis-config.xml을 읽어옴
			Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml"); 
			
			// SqlSessionFactoryBuilder
			
			// 2) SqlSessionFactory
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			
			session = factory.openSession(true);
		
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch end
		return session;
		
	} // getSession() end
} // SqlSessionUtil end
