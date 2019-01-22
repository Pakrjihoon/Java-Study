package array;

public class Ex1 {
	public static void main(String[] args) {
		//var i = [2,3,4]; -> 자바스크립트의 배열 선언법
		
		int[] iArr = new int[5];
		iArr[0] = 3;
		iArr[1] = 4;
		iArr[2] = 5;
		
		// 배열과 for문이 궁합 잘맞음
		for(int j=0; j<5; j++) {
			System.out.println(iArr[j]);
		} //for end
		
		System.out.println("----");
		
		// for each문(향상된 for문 : JAVA 5 버전 추가)
		// for( : 배열(컬렉션)) { 반복구문 }
		for(int i : iArr) {
			System.out.println(i);
		}
	} // main() end
} // Ex1 end
