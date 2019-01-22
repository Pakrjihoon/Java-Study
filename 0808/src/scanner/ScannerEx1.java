package scanner;

import java.util.Scanner;

public class ScannerEx1 {
	// static int a;	
	// 접근제한자가 default 이고 
	// 기본자료형 int형인
	// static 멤버필드 a 
	
	public static void main(String[] args) {
		
		// 콘솔에서 입력받으려면
		// Scanner 객체를 사용
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 이름은 ?");
		
		// Scanner 객체의 주요 메서드
		// nextLine() : 엔터전까지 문자열 얻는 메서드
		String name = scan.nextLine();
		
		System.out.println("당신의 이름은 "+name+" 입니다.");
		scan.close();
	} // main() end
} // ScannerEx1 end
