package access;

public class Ex1 {
	
	/* 
	 * 접근제한자(Access Modifier)
	 * 
	 * 1) public : 다른패키지에서도 접근 가능
	 * 2) protected : 같은 패키지 + 상속
	 * 3) default(키워드 없음) : 같은 패키지
	 * 4) private : 같은 클래스 내부에서만
	 * 
	 */
	
	// 접근제한자가 public 이고 
	// 자료형이 기본자료형 double형인 
	// 인스턴스 멤버필드 a를 선언
	public double a;
	
	// 접근제한자가 protected이고
	// 자료형이 객체자료형 Ex1형인 
	// 스테틱 멤버필드 b를 선언
	protected static Ex1 b;
	
	// 접근제한자가 default 이고
	// 자료형이 객체자료형 String형인
	// 인스턴스 멤버필드 c를 선언
	String c;
	
	// 접근제한자가 private 이고
	// 자료형이 기본자료형 boolean 형인
	// 인스턴스 멤버필드 d를 선언
	private boolean d;
}
