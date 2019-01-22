package control;

public class WhileEx {

	public static void main(String[] args) {
		// 2, 4, 6, 8 출력
//		for(int i=2; i<11; i+=2) {
		
//			System.out.println(i);
//		}// for end
		
		/* 
		 * 반복문 : for문 / while문
		 * - for문과 while문은 완벽하게 바꿔 사용가능
		 * - 반복횟수 완벽하게 알고 있으면
		 *   for문 
		 * - 반복횟수를 명확하게 모르면
		 * 	 while문
		 *  
		 *   for(초기식; 조건식; 증감식) {
		 *   
		 *   }
		 *   
		 *   while(조건식) {
		 *   
		 *   }
		 */
		// while문은 초기식을 바깥에 써주어야한다.
		int i = 1; 
		while(i<10) {
			System.out.println(i+=2);
		}// while end
		
	} //main() end
	
} //WhileEx end
