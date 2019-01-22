package control;

public class Ex17 {
	
	public static void main(String[] args) {
		String str = new String("TEST");
		str = "TEST";
		String str2 = str;
		String str3 = "TEST";
		
		System.out.println(str==str2);
		System.out.println(str2==str3);
		System.out.println(str3.equals(str));
		System.out.println(str2.equals(str3));
		
	}
	// 오버로딩 - 이름 같고, 인자가 다르다.
	// 인자가 다르다는것 !
	// 1) 갯수가 다르다.
	// 2) 자료형이 다르다.
	// 3) 순서가 다르다.
}
