package array;

public class Homework {
	
	private String str;
	
	public Homework() {
		this("Chupa Chups!");
		System.out.println("별");
	}
	private Homework(String str) {
		
		this.str=str;
		System.out.println("원");
	}
	private void test(String str) {
		str = "Hello World";
		
	}
	
	public static void main(String[] args) {
		Homework ho = new Homework();
		ho.test(ho.str);
		String str = ho.str.substring(2,5);
		System.out.println(str);
		System.out.println(ho.str);
	}
}
