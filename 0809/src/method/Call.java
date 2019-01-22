package method;

public class Call {
	private int a = 10;
	/*
	 * 접근제한자가 private이고
	 * 리턴값이 없고,
	 * 인자가 int형 한개인
	 * 인스턴스 메서드 callByValue
	 */
	private void callByValue(int a) {
		++a;
	}
	
	/* 
	 *  접근제한자가 private이고
	 *  리턴이 없고,
	 *  인자가 객체자료형 Call형 1개인
	 *  인스턴스 메서드 callByReference
	 */
	private void callByReference(Call call) {
		call.a++;
	}
	// main에 대한 설명 
		/* 
		 *  접근제한자가 public 이고
		 *  리턴이 없고, 
		 *  인자가 String[] 하나인  -> 배열도 객체자료형
		 *  스테틱 메서드 main
		 */
	public static void main(String[] args) {
		Call call = new Call();
		call.a=10;
		call.callByReference(call);
		System.out.println(call.a);
		
//		int a =5;
//		Call call = new Call();
//		call.callByValue(a);
//		System.out.println(a);
	} //main() end
} //Call end

// 기본자료형 3개 객체자료형 1개 -> 변수 총 4개 선언
// 인스턴스 메서드는 객체를 생성해서 선언해야한다.