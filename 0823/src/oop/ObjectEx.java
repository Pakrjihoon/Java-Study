package oop;

import java.util.Scanner;

public class ObjectEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Object o = "TEST";
		
		// 기본 생성자가 없으면 error
//		Object o2 = new Scanner(System.in);
		// 강제형변환을 해주어야 한다.
//		Scanner scan = (Scanner)o;
		
		/* 
		 * Object 클래스는 최상위 조상
		 * 모든 인스턴스 내부에는 Object 객체가
		 * 존재한다.
		 * - 모든 객체(인스턴스)는 
		 * 	 Object로 형변환 가능
		 * 
		 *  Object 주요메서드
		 *  - toString() : 객체를 문자열로
		 *  패키지명.클래스명@해쉬코드16진수
		 *  
		 *  - hashcode() : 해쉬코드
		 *  C에서 address는 아님
		 *  
		 *  인스턴스가 2개면 해쉬코드값은 다름
		 *  인스턴스가 같다면 해쉬코드값은 같음
		 *  
		 *  
		 */
//		Object o = new Object();
//		Object o2 = new Object();
//		
//		System.out.println(o.toString());
//		System.out.println(o2.toString());
		
		Object o = new Object();
		Object o2 = o;
		ObjectEx ex = new ObjectEx();
		
//		System.out.println(ex.toString());
		Object s = new String("TEST");
		Object s2 = new String("TEST");
		
//		System.out.println(s.toString());
		
		System.out.println(s==s2);
		
		// Object 형이지만 오버라이딩으로 인해 true 출력
		System.out.println(s.equals(s2));
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		//만약 진짜 hashCode를 출력하고 싶으면
		// System.identifyHashCode()를 사용한다.
	
		int hash1 = System.identityHashCode(s);
		int hash2 = System.identityHashCode(s2);
		System.out.println(hash1);
		System.out.println(hash2);
		
		System.out.println("--------------");
		Object o3 = "TEST";
		Object o4 = "TEST";
		
		System.out.println(o3==o4);
		System.out.println(o3.equals(o4));
		
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
		
		int hash3 = System.identityHashCode(o3);
		int hash4 = System.identityHashCode(o4);
		System.out.println(hash3);
		System.out.println(hash4);
	} //main() end

} // ObjectEx end
