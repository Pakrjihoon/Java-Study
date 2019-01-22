package constructor;

import vo.Actor;

public class ConstructorEx {
	
	public static void main(String[] args) {
		/* 
		 * 객체를 생성할때
		 * 멤버필드를 초기화하기 위해서
		 * 생성자를 이용
		 */
		Actor actor = new Actor("강동원",186,66,"부산");
		System.out.println(actor.getBirthPlace());
		
		Actor actor2 = new Actor();
		
//		actor.setName("강동원");
//		actor.setHeight(186);
//		actor.setWeight(66);
//		actor.setBirthPlace("부산");

	} //main() end
	
} //ConstructorEx end
