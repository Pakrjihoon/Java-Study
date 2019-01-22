package oop;

public class ObjectEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new ObjectEx2();
		
		//String s = (String)o;	// 이 부분에서 에러 발생한다. 
		// ObjectEx2 에서는 String 이 없기 때문이다.
		
		//instanceof 라는 연산자
		// 레퍼런스변수 instanceof 클래스
//		System.out.println(o instanceof String); // 없기 때문에 false로 출력
//		System.out.println(o instanceof ObjectEx2);
		
		// 안전한 코딩을 위해서
		if(o instanceof String) {
			String s = (String)o;
			System.out.println(s.substring(2));
		} else {
			System.out.println("None String");
		} //else
		
	} //main() end

} // Object end;
