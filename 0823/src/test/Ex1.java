package test;

public class Ex1 {
	public static void main(String[] args) {
		
		// 당신이 좋아하는 영화는 ?
		String[] movies = {
				"인턴",
				"독전",
				"인크레더블2",
				"아이언맨",
				"어벤저스:인피니티워",
				"어바웃타임"};
		
		// 일반 for문을 이용한 출력
		for(int i=0; i<movies.length; i++) {
			System.out.println(movies[i]);
		}
		System.out.println("--------------");
		//향상된 for문을 이용한 출력 (for each) 
		for(String title : movies) {
			System.out.println(title);
		}
		
	} //main() end
} //Ex1 end
