package string;

import java.util.StringTokenizer;

public class TokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bp = "지수,제니,로제,리사";
		
		/*
		 * StringTokenizer라는 클래스 활용
		 * hasMoreTokens() : 토큰이 있는지 확인
		 * nextToken() : 다음토큰 반환
		 */
		
		// java.util.StringTokenizer 를 import 해주어야 사용 가능
		StringTokenizer stok = new StringTokenizer(bp,",");
		// java.lang에 있기에 import가 되어있다.
		// StringBuilder buildEx;
		
		while(stok.hasMoreTokens()) {
			String name = stok.nextToken();
			System.out.println(name);
		}
	} // main() end

} // TokenizerEx end
