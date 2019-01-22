package vo;

public class ActorApp {
	public static void main(String[] args) {
		
		// 당신이 좋아하는 배우는 ?
		// (이름, 나이, 키, 몸무게)
		
		Actor a1 = new Actor("김다미",23,170,58);
		 
		System.out.println(a1);
		
		Actor a2 = new Actor();
		a2.setName("전지현");
		a2.setAge(36);
		a2.setHeight(168);
		a2.setWeight(52);
		System.out.println(a1.equals(a2));
		
		Object o = new Actor("김다미",23,170,58);
		System.out.println(o);
		
	} //main() end
} // ActorApp end
