package exception;

import java.util.Scanner;

public class ExceptionEx6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("나이를 입력해주세요 ");
			int age ;
			try {
				String txt = sc.nextLine();
				// 입력한 문자열을 int형으로 변환
				age = Integer.parseInt(txt);
				System.out.println("당신의 나이는 "+age+"살 입니다.");
				break;
			} catch(Exception e) {
				System.out.println("숫자로 입력하세요");
			}
		}		
	}
}
