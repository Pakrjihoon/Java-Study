package operator;

public class Ex2 {

	public static void main(String[] args) {

		/* 
		 * 삼항연산자는 항이 3개
		 * 
		 * - 논리식 ? 값1 : 값2
		 * - 무조건 if~else로 처리 가능
		 * - 호불호가 갈리는 연산자
		 * 
		 */
		// true이면 비례식의 앞 부분이며 false이면 뒷부분
		int i = true ? 3 : 5;
		System.out.println(i);
		
		int j = 0;
		if (5>3) {
			j = 3;
		} else {
			j = 5;
		} // if~else end
		
		// true이면 비례식의 앞부분, false는 뒷부분
		String animal = true ? "강아지":"고양이";
		System.out.println(animal);
	} // main() end

} // Ex2 end
