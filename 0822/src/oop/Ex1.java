package oop;

class A {
	int a = 1;
	public A() {
		super();
	} // A() end;
	void test() {
		System.out.println("A");
	}
} // A end

class B extends A {
	int a = 5;
	
	public B() {
		super();
		// this() 와 super()는 가장 첫번째 줄에 있어야만 한다.
	}
	void test() {
		System.out.println("BBBB");
	}
}
public class Ex1 extends A {
	public static void main(String[] args) {

		// String s = new Ex1();
		// 인스턴스 내부에서는 Ex1() 과 Object 객체가 생성
		// String 은 X
		//Object o = new Ex1();
		// Object 객체 ( 최상위 루트 )로 인스턴스 내부에서 생성이 되어 가능
		
		// A a = new Ex1(); // 원래는 불가능 
		// 상속을 이용해 extends A 를 선언해주면
		// A클래스의 기본 생성자 내부에서 Object의 기본생성자 호출 
		
		// A b = new B();
		// A 자리에 쓸 수 있는건 Object, A, B 를 쓸 수 있다
		// 인스턴스 안에 Object,A,B가 전부 존재
		
		// 다형성 예제
		A a = new B();
		B b = (B)a;
		//Object o = a;
		//b = (B)o;
		//System.out.println(a.a);
		//System.out.println(b.a);
		
		/*
		 * 오버라이딩이란 메서드 재정의입니다.
		 * 상속관계에서 
		 * 똑같은 메서드(이름도 같고, 인자도 같고, 리턴자료형이 같아야함)
		 * 
		 * 상속관계에서 부모의 메서드를 호출해도
		 * 최하위 자식의 메서드가 작동되는 것
		 */
		a.test();
		b.test();
	} //main() end
} //Ex1 end
