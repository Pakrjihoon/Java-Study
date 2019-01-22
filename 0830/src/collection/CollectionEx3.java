package collection;

import java.util.List;
import java.util.Vector;

public class CollectionEx3 {
	public static void main(String[] args) {
		
		/*
		 *  Collection에 들어갈 자료형을
		 *  딱 지정하는 것 : 제네릭
		 *  - <> 
		 */
		
		List<String> list = new Vector();
		list.add("하정우");
		list.add("정우성");
		list.add("주지훈");
		list.add("마동성");
		list.add("이성민");
		
		for (String name : list) {
			System.out.println(name.substring(1));
		}
	}
}
