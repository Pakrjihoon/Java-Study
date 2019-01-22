package equal;

class A {
	
	int a;
	
}

public class Test {
	
	public static void main(String[] args) {
		A a = new A();
		a.a=3;
		A b = new A();
		b.a=7;
		b = a;
		
		// 객체의 항등 : 레퍼런스 비교
		System.out.println(a==b);
		
		//(String을 제외한 거의 모든 클래스는) equals메서드 :
		// 레퍼런스 비교(==와 같음)
		System.out.println(a.equals(b));
	} //main() end
} // Test end
