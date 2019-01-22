package vo;

public class Homework {
	int a;
	private int test(int a) {
		return a++;
	}
	private int test2(Homework h) {
		return h.a++;
	}
	public static void main(String[] args) {
		Homework h = new Homework();
		h.a =5;
		int a =4;
		h.test(a);
		a = h.test2(h);
		
		System.out.println(h.a);
		System.out.println(a);
	}
}
