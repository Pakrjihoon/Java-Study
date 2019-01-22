package string;

public class APIEx {
	public static void main(String[] args) {
		String s = "Hello Java";
		String s2 = "wlgns8852@naver.com";
		/*
		 * String이 가진 메서드
		 * - charAt(인덱스) : 리턴 자료형 char
		 * - substring(시작)
		 * - substring(시작,끝)
		 * - indexOf(글자) 
		 */
		
		// 어떤 메일을 쓰고 있는지 확인 
		String email = "asdfg@google.com";
		s = s.substring(1, 4);
		System.out.println(s);
		// System.out.println(s2.charAt(3));
		System.out.println(s2.indexOf("n"));
		System.out.println(s2.length());
		
		// 사용자마다 이메일 주소의 길이가 다르기에 문제 발생
		System.out.println(email.substring(6));
		
		// 사용자에 따라서 해당이 되는 인덱스 값을 얻어오고 그 부분부터
		// 리턴을 해줌
		System.out.println(email.substring(email.indexOf("@")+1));
		
		
		
	} //main() end
} //APIEx
