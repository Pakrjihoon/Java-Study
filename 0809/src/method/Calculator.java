package method;

public class Calculator {
/*
 * 메서드의 선언법
 * 
 * 접근제한자 (static) 리턴자료형 메서드명(인자...)
 * 
 * void : 리턴값이 없음
 */
	public int add(int a,int b) {
		return a+b;
		//static 으로 선언을 하면 객체를 만들 필요없이 사용 가능
	} //add() end
	
	public int substract(int a,int b) {
		return a-b;
	} // substract() end
	public int multiple(int a, int b) {
		return a*b;
	} // multiple() end
	public double divide(int a, int b) {
		return (double)a/b;
	} // divide() end
	public int remainder(int a, int b) {
		return a%b;
	} // remainder() end 

} //Calculator end
