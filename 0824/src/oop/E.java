package oop;
class A {
	int c = 1;
}
class B extends A {
	int b = 4;
}
class C extends B {
	int a = 7;
}
public class E extends C{
	int d = 4;
	public static void main(String[] args) {
		Object o = new C();
		E e = new E();
		A a = (A) o;
		B b = e;
		C c = (C) a;
		e = (E) c;
		o = "TEST";
	}
}
