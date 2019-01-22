package type;

public class TypeEx2 {
	
	public static void main(String[] args) {
		/* 
		 * boolean형 : 논리형
		 * - 값 : true / false
		 * - 기본값 : false 
		 */
		// 기본자료형 boolean형
		// 지역변수 a를 선언하고 
		// 논리곱을 통하여 false 를 a에 대입(초기화)
		boolean a = true && false;
		
		/* 
		 * char형 : 한글자 자료형
		 * - '' 으로 표시
		 * - 0~65535 (내부적으로 정수처리) : 양수만
		 * - 크기 : 2byte
		 * - 주요코드 
		 *  0 : 48
		 *  A : 65
		 *  엔터 : 13
		 *  a : 97
		 * - \\u 16진수 4자리
		 * - \t : 탭키
		 * - \n 
		 * - \\ 
		 * 
		 */
		// 기본자료형 char형
		// 지역변수 c를 선언
		char c;
		c = 'a';
		System.out.println(c-1);
		
	} //main() end

} //TypeEx2 end
