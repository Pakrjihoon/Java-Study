package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 휴대폰 번호는 ?");
		System.out.println("ex) 010 - 1234 - 1234");
		Scanner sc = new Scanner(System.in);
		String sc2 = sc.nextLine();
		StringTokenizer num = new StringTokenizer(sc2,"-");
		
		// StringTokenizer를 이용하여 결과 출력
		while(num.hasMoreTokens()) {
			System.out.println(num.nextToken());
		}
		
		// split으로 이용하여 출력 
		String[] phone = sc2.split("-");
		for(int i=0; i<phone.length; i++) {
			System.out.println(phone[i]);
		}
		
	} //main() end
} //Ex2 end
