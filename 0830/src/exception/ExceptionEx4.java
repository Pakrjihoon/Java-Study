package exception;

public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2/0);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			// 에러발생 유무에 상관없이 무조건 작동
			System.out.println(5);
		}
		System.out.println(6);
	}
}
