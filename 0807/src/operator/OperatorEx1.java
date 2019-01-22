package operator;

public class OperatorEx1 {
	
	
	
	public static void main(String[] args) {
		
		//여러가지 연산자
		// 1) ! : 부정연산자
		// 2) + : 피연산자가 숫자면 덧셈
		//        피연산자가 둘중에하나라도
		//        문자열이면 문자열합침
		// 3) - : 뺄셈
		// 4) * : 곱셈
		// 5) / : 나눗셈
		// 6) % : 나머지 
		
		
		//기본자료형 boolean형
		//지역변수 a를 선언하고
		//값 true를 대입
		boolean a = true;
		
		a = !a;//false
		
		//System.out.println(a);
		
		//기본자료형 int형 지역변수 a를 
		//선언하고 3으로 초기화
		int b = 3;
		//기본자료형 int형 지역변수 c를
		//선언하고 2로 초기화
		int c = 2;
		
		int result = b + c;
		//System.out.println(b+"+"+c+"="+result);
		
		result = b - c;
		
		//System.out.println(b+"-"+c+"="+result);
		
		//System.out.println(b+"*"+c+"="+b*c);
		
		int y = 5;
		int x = 2;
		
		double z = (double)y/x;
		
		//System.out.println(z);
		
		System.out.println(7%5);
		
		
		
	}//main() end
	
}//OperatorEx1 end







