package type;

public class TypeEx3 {

	public static void main(String[] args) {

		/* 
		 * 정수형
		 * - 자바의 기본 정수 : int형
		 * 
		 * byte
		 * - 크기 : 1byte
		 * - 표현 범위 : -128 ~ 127
		 * - 기본값 : 0
		 * 
		 * short 
		 * - 크기 : 1byte
		 * - 표현범위 : -32768 ~ 32767
		 * - 기본값 : 0
		 * 
		 * int 
		 * - 자바의 기본정수
		 * - 크기 : 4byte
		 * - 표현범위 : -2147483648 ~ 2147483647
		 * - 기본값 : 0
		 * 
		 * long 
		 * - 크기 : 8byte
		 * - 표현범위 : 9223372036854775807
						~ -9223372036854775808
		 * - 기본값 : 0L
		 */
		// 기본자료형 byte형 
		// 지역변수 b를 선언
		byte b = 127;
		System.out.println(b);
		
		// 기본자료형 int형 
		// 지역변수 i를 선언하고 값 30000을 대입
		int i = 30000;
		System.out.println(i);
		
		long a = 30000000000000000L;
		System.out.println(a);
	} //main() end

} //TypeEx3 end
