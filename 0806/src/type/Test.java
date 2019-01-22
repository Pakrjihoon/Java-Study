package type;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.println(a);
		}
		else if(a==1) {
			System.out.println(a);
		}
		else if(a>1) {
			int sum =  (a-2)+(a-1);
			System.out.println(sum);
		}
		
		
		
	}

}
