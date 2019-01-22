package app;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class IdolsApp {
	public static void main(String[] args) throws Exception{
		
		SqlSession session = SqlSessionUtil.getSession();
		// 무조건 첫번째 인자는 네임스페이스.아이디
		// 두번째 인자가의 여부 기준은 parameterType이 있으면
		// 알맞게 넣어준다.
		int result = session.delete("idols.delete",1);
		System.out.println(result + "개 삭제 완료");
	} // main() end
} //IdolsApp end
