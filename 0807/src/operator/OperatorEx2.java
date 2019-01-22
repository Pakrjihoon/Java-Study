package operator;

public class OperatorEx2 {
	
	public static void main(String[] args) {
		
		/*
		 *  ++ : 증가연산자(1증가)
		 *  -- : 감소연산자(1감소)
		 *  
		 *  후위증가연산자 마지막에 증가
		 *  (대입연산자보다 우선순위가 낮다)
		 * 
		 */
		
		int a = 3;
		
		int b = a++;
		
		System.out.println(a++);
		System.out.println(b);
		
	}//main() end

}//OperatorEx2 end
