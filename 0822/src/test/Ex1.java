package test;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 일반 for문
		for(int i=10; i>5; i--) {
			System.out.println(i);
		} //for end
		
		System.out.println("------------");
		
		//향상된 for문
		int[] j = {10,9,8,7,6};
		for(int j2: j) {
			System.out.println(j2);
		} // for end
		
	} //main() end
} //Ex1 end
