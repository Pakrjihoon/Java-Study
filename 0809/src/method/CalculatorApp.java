package method;

public class CalculatorApp {
	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator calc = new Calculator();
		// Calculator 클래스의 기본 생성자 호출
		int result = calc.add(3, 2);
		System.out.println(result);
		
		result = calc.substract(5, 2);
		System.out.println(result);
		
		result = calc.multiple(5, 2);
		System.out.println(result);
		
		double result2 = calc.divide(5, 2);
		System.out.println(result2);
		
		result = calc.remainder(20, 3);
		System.out.println(result);
	}
}
