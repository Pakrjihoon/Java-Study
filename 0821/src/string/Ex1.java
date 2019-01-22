package string;

public class Ex1 {
	public static void test() {
		
	}
	public static void main(String[] args) {
		
		/*
		 * String은 내부 편집이 되지 않습니다.
		 * 그렇기 때문에 객체가 계속 생성됩니다.
		 * 
		 */
//		String msg = "H";
//		msg += "E";
//		msg += "L";
//		msg += "L";
//		msg += "O";
//		
//		System.out.println(msg);
		
		/*
		 * StringBuffer(java 1.0)
		 * - 동기화 되어있음
		 * - 속도 느림
		 * 
		 * StringBuilder(java 1.5)
		 * - 동기화 되어있지 않음
		 * - 속도 빠름
		 */
		StringBuilder sb = new StringBuilder("H");
		
		// 기존의 문자열에 추가
		sb.append("E");
		sb.append("L");
		sb.append("L");
		sb.append("O");
		
		//객체를 String으로 변경하는 메서드
		// toString()
		String s = sb.toString();
	
		System.out.println(s);
	}
}
