package control;

class A {
	int a;
	static int b;
	A c;
}
public class Test2 {

	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		a = b;
		b =null;
		a.a =5;
		a.b=a.a;

		a=b;
		System.out.println(b);
	}
}

