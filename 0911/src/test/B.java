package test;

public class B implements A{

	@Override
	public void toast() {
		// TODO Auto-generated method stub
		System.out.println("dd");
	}
	// @Override 를 붙여주는 이유 (annotation - java 6버전 부터 나옴)
	// annotation - 편리함을 위함 없어도 상관은 없음
	// 반드시 오버라이딩 되어야만 한다. (확인시켜줌)
	// 개발자의 오타등 실수를 방지하기 위함 
	
}
