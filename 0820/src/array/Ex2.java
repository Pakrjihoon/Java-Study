package array;

public class Ex2 {
	public static void main(String[] args) {
		String[] blackPink = {"지수","제니","로제","리사"};
		
		// 일반 for문 출력 
		for(int i=0; i<blackPink.length; i++) {
			System.out.println(blackPink[i]);
		}
		
		System.out.println("-----------");
		
		// 향상된 for문 출력
		for(String memberName : blackPink ) {
			System.out.println(memberName);
		}
	}
}
