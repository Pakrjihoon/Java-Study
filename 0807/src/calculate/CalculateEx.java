package calculate;

public class CalculateEx {
	
	public static void main(String[] args) {
		
		byte a = 1;
		byte b = 2;
		int c = a + b;
		
		/*
		 * int형보다 작거나 같은 자료형끼리의
		 * 연산을 하면 그 결과는 무조건 int형
		 * 
		 * int보다 크면 큰자료형으로
		 * 
		 */
		
		int i = 10;
		
		long l = 100;
		
		long result = i+l;
		
		System.out.println(result);
		
		
	}//main() end

}//CalculateEx end
