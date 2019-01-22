package app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class GroupSelectApp {
	public static void main(String[] args) {
		
		SqlSession session = SqlSessionUtil.getSession();
		List<Group> groups = session.selectList("groups.selectList");
		
		for(Group group : groups ) {
			System.out.println(group);
		}
		
	}
}
