package scanner;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
			System.out.println("두 정수를 입력하세요");
			
			Scanner scan = new Scanner(System.in);
			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			System.out.println(num1+"/"+num2+"="+((double)num1/num2));
	} // main() end
} // ScannerEx4 
