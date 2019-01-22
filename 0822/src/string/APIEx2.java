package string;

public class APIEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rv = "아이린,슬기,웬디,조이,예리";
		String[] names = rv.split(",");
		
		// 향상된 for문을 이용하여 출력
		for(String s: names) {
			System.out.println(s);	
		}
		
		System.out.println("------------");
		
		// 일반 for 문을 이용하여 출력
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	
	}

}
