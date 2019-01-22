package collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionEx1 {
	
	public static void main(String[] args) {

		/* 
		 *  컬렉션 객체들은
		 *  인스턴스(객체)를 수집하는 객체입니다.
		 *  
		 *  1) Set 
		 *  - 중복 허용 X
		 *  - index 없음 / 
		 *  - 구현클래스 : HashSet(정렬X), TreeSet(정렬)
		 *   
		 *  2) Map
		 *  
		 *  3) List
		 *  
		 *  4) 제네릭 
		 */
		Set set = new HashSet();
		set.add(3);
//		 컬렉션은 객체(인스턴스)를 수집합니다.
//		 3은 int 3이 아닌 Integer 입니다. (오토박싱)
		set.add(2);
		set.add(1);
		set.add(231);
		set.add(123);
		
	}
}
