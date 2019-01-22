package exception;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		
		/*
		 *  에러 : 프로그래머가 수습할 수 없는 심각한 오류
		 *  예외 : 수습할 수 있는 오류
		 */
		/* 
		 * 지금 까지 우리가 수업에서 봤던 Exception들
		 * - NullPointerException
		 * - ArrayIndexOutOfBoundsException
		 * - StringIndexOutOfBoundsException
		 * - ClassNotFoundException
		 * - ClassCastException
		 * - SQLException
		 * - NumberFormatException
		 * - ArithmeticException : 산수예외
		 */
		
		/*
		 * 예외처리
		 * 
		 * try ~ catch 구문
		 * 
		 * 에러가 발생할 구문은 try 구문에
		 */
		
		Random ran = new Random();
		int size = 0;
		
		for(int i=0; i<100; i++) {
			try {
				System.out.println(5/ran.nextInt(5));
			} catch(ArithmeticException e) {
				++size;
				System.out.println("에러");
			} // try ~ catch end
		}
		System.out.println("에러 발생 횟수 : "+size);
	}
}
