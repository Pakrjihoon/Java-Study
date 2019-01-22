package animal;

public abstract class Animal {
	String name;
	
	//빈(empty) 메서드
//	private void test() {
//		
//	}
	/*
	 * 추상메서드 : 본체(body)가 없는 메서드
	 * 추상의 키워드 : abstract 키워드를 붙인 클래스
	 * 
	 * 추상클래스
	 * - abstract 키워드를 붙인 클래스
	 * - 생성자를 호출하여 인스턴스화(객체로)를 하지 못합니다.
	 * - 추상클래스는 반드시 추상메서드를 가질 필요는 없다.
	 * - 반대로 추상메서드를 가지면 
	 *   추상클래스가 되어야만 합니다.
	 *   (추상 메서드를 직접 호출하면 작동되는 body가 없어서
	 *    직접 호출할 수 없게 만들어야 합니다.
	 *    그래서 추상메서드를 가진 클래스를 
	 *    추상 클래스로 만들어야 합니다.)
	 * 
	 * - 추상메서드 : abstract를 붙이고 body(본체)가 없는 메서드
	 * - 추상메서드를 가진 추상클래스를 상속받는
	 *   클래스는 반드시 추상메서드를 재정의(Overriding)
	 *   해야만 합니다.		
	 */
	public abstract void cry();
}


