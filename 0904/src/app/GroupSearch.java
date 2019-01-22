package app;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class GroupSearch {
	public static void main(String[] args) {
		System.out.println("키워드 입력");
		SqlSession session = SqlSessionUtil.getSession();
		Scanner sc = new Scanner(System.in);
		String keyword = sc.nextLine();
		
		List<Group> groups = session.selectList("groups.search","%"+keyword+"%");
		
		for(Group group: groups) {
			System.out.println(group);
		}
	}
}
