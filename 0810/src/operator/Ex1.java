package operator;

public class Ex1 {
	
	/*
	 * 접근제한자가 public 이고 
	 * 리턴값이 없고,
	 * 인자가 String[] 하나인 
	 * 스테틱 main 메서드
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		/* 
		 * & 와 | : 비트연산자
		 * && 와 || : 논리연산자
		 * 
		 * 비트연산자와 논리연산자의 차이
		 * 
		 * 논리연산자는 무조건 논리가 중요.
		 * (true냐? false냐?)
		 * 
		 * 예를 들면 
		 * 1) || 일때는
		 * 피연산자1이 true면 뒤 실행안함
		 * 
		 * 2) && 일때는
		 * 피연산자1이 false면 뒤 실행안함
		 * 
		 * (비트연산자 무조건 앞뒤 다 수행)
		 */
		if(a==b & ++a == b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		} // if~else end
		
		System.out.println(a);
		System.out.println(b);
	} //main() end
	
} //Ex1 end
