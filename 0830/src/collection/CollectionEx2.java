package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx2 {
	public static void main(String[] args) {
	/*
	 * List는 무한 Object배열이라고
	 * 생각하면 됩니다.
	 * 
	 * List를 사용하는 이유 : 
	 * 배열은 크기를 무조건 지정하고
	 * 늘어나거나 줄어들 수 없습니다.
	 * 그래서 List를 사용합니다.
	 * 
	 * List
	 * - index 있음
	 * - 중복 허용
	 * - 구현클래스 : Vector (java 1.0부터) :
	 * 					동기화 됨, 속도 느림
	 * 				 , ArrayList (java 1.2 부터) : 
	 * 					동기화 안되고, 속도 빠름 
	 */
		List list = new ArrayList();
		list.add("제니");
		list.add("지수");
		list.add("로제");
		list.add("리사");
		
		/* 일반 for문 */
//		for (int i=0; i<list.size(); i++) {
//			Object name = list.get(i);
//			System.out.println(name.toString());
//		}
		/* 향상된 for 문 */
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
