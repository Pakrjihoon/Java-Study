package app;

import java.sql.Date;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Idol;

public class IdolsInsertApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SqlSession session = SqlSessionUtil.getSession();
		Idol idol = new Idol();
		System.out.println("아이돌 입력 프로그램");
		System.out.println("이름을 입력하세요 ");
		String name = sc.nextLine();
		System.out.println("키를 입력하세요");
		String height = sc.nextLine();
		System.out.println("몸무게를 입력하세요");
		String weight = sc.nextLine();
		System.out.println("생년월일을 입력하세요 ");
		System.out.println("ex) 2013-01-01 ");
		String birthDate = sc.nextLine();
		Date birthDate2 = Date.valueOf(birthDate); 
		System.out.println("소속사를 입력하세요");
		String agentName = sc.nextLine();
		System.out.println("성별을 입력하세요 (M 남, W 여)");
		String gender = sc.nextLine();
		System.out.println("그룹 번호를 입력하세요");
		String groupId = sc.nextLine();
		
		idol.setName(name);
		idol.setHeight(Integer.parseInt(height));
		idol.setWeight(Integer.parseInt(weight));
		idol.setBirthDate(birthDate2);
		idol.setAgentName(agentName);
		idol.setGender(gender);
		idol.setGroupId(Integer.parseInt(groupId));
		
		int result = session.insert("idols.insert",idol);
		System.out.println(result+"개 입력 완료");
		
	} // main() end

} // IdolsInsertApp
