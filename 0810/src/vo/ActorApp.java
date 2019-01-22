package vo;

public class ActorApp {

	public static void main(String[] args) {
		
		Actor actor = new Actor();
		
		actor.setName("Amanda");
		actor.setWeight(58);
		actor.setHeight(160);
		actor.setBirthPlace("U.S.A");
		actor.setAge(34);
		
		int height = actor.getHeight();
		int weight = actor.getWeight();
		String birthPlace = actor.getBirthPlace();
		String name = actor.getName();
		int age = actor.getAge();
		
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
		System.out.println("출생지 : "+birthPlace);
		System.out.println("나이 : "+age);

	}

}
