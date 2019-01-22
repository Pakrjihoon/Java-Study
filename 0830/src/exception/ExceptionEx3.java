package exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		
		/*
		 *  예외처리에서는 catch 를 여러개 쓸 수있다.
		 *  다만 여러개의 catch 구문을 쓸 때는 
		 *  Exception의 최상위 예외인 Exception을 선언하게될 경우
		 *  상속관계에 있던 자식, 그리고 자식의 자식(자손) 예외처리
		 *  까지는 도달할 수 없으므로 오류가 발생한다.
		 *  여러개의 catch 구문을 작성할때에는 최상위 catch에는
		 *  최하위 Exception 종류부터 작성을 해야한다.
		 *  */
		
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} catch (RuntimeException e) {
			System.out.println(5);
		} catch (Exception e) {
			System.out.println(6);
		}
		System.out.println(7);
	}

}
