package ex;

import access.Ex1;

public class AccessApp {
	public static void main(String[] args) {

		// Ex1 클래스를 가지고 만들어진
		// 객체의 레퍼런스를 담을 수 있는
		// 지역변수 ex를 선언하고
		// new라는 키워드를 통해서 
		// heap 메모리영역에 공간을 할당받고 
		// Ex1 클래스의 기본생성자를 호출하여
		// Ex1 객체를 생성한 뒤
		// 그 레퍼런스를 ex에 대입
		Ex1 ex = new Ex1();
		
	} //main() end
} //AccessApp end
