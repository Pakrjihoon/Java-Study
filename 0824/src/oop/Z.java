package oop;

public interface Z {

	/*
	 * 인터페이스는
	 * - 상수와 추상메서드만 가짐
	 * - 상수의 선언 static final로
	 * - 상수의 접근제한자는 public으로만 선언
	 * - public static final (자료형) 상수명
	 *   (반드시 초기화해서 사용)
	 *   
	 * - 인터페이스에서는 무조건 상수만
	 *   가질 수 있기 때문에 (자바의 숨겨진 비밀)
	 *   static final을 생략 가능
	 *   
	 * - 인터페이스에서는 무조건 추상메서드만
	 *   가질 수 있기 때문에 (자바의 숨겨진 비밀)
	 *   abstract가 생략 가능
	 */
	public final int A = 10;
	public int B = 5;
	
	public abstract void test();
	public void test2();
 }
