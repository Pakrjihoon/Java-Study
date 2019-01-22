package app;

import java.sql.Date;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class GroupsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 그룹을 입력하세요");
		SqlSession session = SqlSessionUtil.getSession();
		Group group = new Group();
		String groupName = sc.nextLine();
		group.setName(groupName);
		
		System.out.println("데뷔일을 입력하세요");
		String StringDebutDate = sc.nextLine();
		
		// java.sql.Date 형 만들기 (YYYY-[m]m-[d]d)
		Date debutDate = Date.valueOf(StringDebutDate);
		group.setDebutDate(debutDate);
		
		int result = session.insert("groups.insert",group);
		
		System.out.println(result+"개 그룹입력");
	}
}
