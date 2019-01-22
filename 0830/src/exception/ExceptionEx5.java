package exception;

public class ExceptionEx5 {

	private static void test() {
		
		throw new RuntimeException();
		
	} //test() end
	
	public static void main(String[] args) {
		
		/*
		 * throws : 메서드에 붙는 키워드
		 * 
		 * throw : 예외를 던지는 키워드
		 * 			(예외 강제 발생) 
		 * 
		 * Exception 중에
		 * RuntimeException의 자손들은
		 * 예외처리를 하지 않아도
		 * 컴파일 에러가 발생하지 않습니다.
		 * 컴파일 에러를 처리하지는 않는다.
		 */
		try {			
			test();
		} catch (Exception e) {

		}
	}

}
