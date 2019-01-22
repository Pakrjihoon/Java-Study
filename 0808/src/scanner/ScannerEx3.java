package scanner;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String [] args) {
	// 스캐너클래스를 가지고 만들어진
	// 객체의 레퍼런스를 담을 수 있는
	// 지역변수 scan을 선언하고
	// new 라는 키워드를 통해서
	// heap 메모리영역의 공간을 할당받고
	// Scanner 클래스의 생성자를 호출하여
	// Scanner 객체를 생성한 후 그 객체의
	// 레퍼런스를 scan  변수에 대입
	Scanner scan = new Scanner(System.in);

	System.out.println("두 개의 정수를 입력하세요 ");
	// nextInt() : 입력한 정수 한개 얻는 메서드
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
}
