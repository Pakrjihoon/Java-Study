package wrapper;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b = new Boolean(true);
		// String의 값이 대,소문자 상관없이
		// T R U E 만 true 나머지는 전부 false
		Boolean b2 = new Boolean("TrUe");

		Boolean b3 = true;	//오토박싱 (암시적 객체생성)
		Boolean b4 = true;
		//System.out.println(b==b2);
		
		//boolean bb = b3; //언박싱


		
		System.out.println(b==b3);
	} //main() end

} //Ex2 end
