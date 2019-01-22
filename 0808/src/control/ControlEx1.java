package control;

import java.util.Scanner;

public class ControlEx1 {
	public static void main(String[] args) {
		// 나이를 입력받아 
		// 20살 이상이면
		// 당신은 성인입니다. 
		// 미만이면
		// 당신은 성인이 아닙니다. 라고 출력
		
		System.out.println("나이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		String msg = "이 아닙";
		if(age >=20) {
			msg = "입";
		} //if end;
		System.out.println("당신은 성인"+msg+"니다.");
	}// main() end
} // ControlEx1 end
