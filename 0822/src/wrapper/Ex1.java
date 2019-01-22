package wrapper;

public class Ex1 {
	public static void main(String[] args) {
		
		/* 
		 * 기본자료형을 객체자료형으로 
		 * 활용하기 위해 필요한 클래스들을
		 * Wrapper(랩퍼) 클래스라고 합니다.
		 * 
		 * - Integer
		 * - Character
		 * - Boolean
		 * - Long
		 * - Double
		 * - Float
		 * - Byte
		 * - Short
		 * 
		 */
//		int max = Integer.MAX_VALUE;
//		int min = Integer.MIN_VALUE;
//		System.out.println(max);
//		System.out.println(min);
		
//		String num = "123";
// 		문자열을 int 형으로 변환
//		int i = Integer.parseInt(num);
//		System.out.println(i);
		
		Integer i = new Integer(3);
		Integer i2 = new Integer(3);
		
		/*
		 * Java 5(1.5) 버전에 추가된
		 * 오토박싱, 언박싱
		 */
		i = 3; // 암시적 객체생성(오토박싱)
		
		// equals() 메서드로 값 비교
		System.out.println(i.equals(i2));
		// == 항등 연산자로 레퍼런스 비교
		System.out.println(i==i2);
		
		
	} //main() end
} //Ex1 end
