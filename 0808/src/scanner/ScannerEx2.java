package scanner;

import java.util.Scanner;

public class ScannerEx2 {
	
	public static void main(String [] args) {
		// 실행하면 당신이 좋아하는 영화는 ?
		
		// 입력하면 
		
		// 당신은 XXX를 좋아하는군요.
		Scanner scan = new Scanner(System.in);
		System.out.println("당신이 좋아하는 영화는 ? ");
		String movie = scan.nextLine();
		System.out.println("당신은 "+movie+" 를 좋아하는 군요");
		scan.close();
	} // main() end
} // ScannerEx2 end
