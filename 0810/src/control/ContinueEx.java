package control;

public class ContinueEx {

	public static void main(String[] args) {
		
		/*
		 * continue 키워드를 만나면
		 * 그 이후의 코드 한번을 넘어감
		 * 
		 * break 키워드를 만나면
		 * 무조건 반복문 벗어남
		 */
//		for (int i =0; i<10; i++) {
//			if(i==5) {
//				continue;
//				// continue 문장을 한번 만난 이후부터 실행으로
//				// 5를 제외하고 출력한다.
//			} // if end
//			
//			System.out.println(i);
//			
//		} //for end
		for (int i = 0; i<100; i++) {
			System.out.println(i);
			if(i==11) {
				break;
			} // if end
		}
	} // main() end
	
} // ContinueEx end
