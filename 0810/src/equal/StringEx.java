package equal;

public class StringEx {
	public static void main(String[] args) {
		
		/* 
		 * new 클래스생성자() <= 명시적 객체생성
		 * 
		 * String은 암시(묵시)적 객체생성
		 * "Develop" <-----
		 * 
		 * '==' <==> equals() 같음 : 레퍼런스 비교
		 * String은 '==' 레퍼런스 비교
		 * equals() 값비교
		 */
		String a = "TEST"; // String 객체
		String b = new String("TEST");
		String c = "TEST";
		String d = new String("TEST");
		String e = "test";
		
		System.out.println(a.equals(b));
		System.out.println(c.equals(e));
		// 대,소문자 다르면 false 
		
		System.out.println(a==c);
	} //main() end
} //StringEx end
