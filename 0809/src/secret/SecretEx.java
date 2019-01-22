package secret;
/* 
 *  자바의 숨겨진 비밀
 *  - 편리함을 위해서 문법에 어긋나는 것들 
 * 	- 1) import 관련 : java.lang.* 생락갸능
 *  - 2) static 관련 : 같은 클래스 내부에서
 *  					static 멤버 접근시 '클래스명.' 생략가능
 *  - 3) instance 관련 : 같은 클래스 내부에서
 *  					 instance 멤버 접근시 
 *  					 'this.' 생략가능
 */
// 1)번 비밀
import java.lang.*;

public class SecretEx {
	private static int a;
	
	int b;
	
	void test(int a) {
		
		// 3)번의 비밀
		// this.b = 100;
		b = 100;
	}
	
	public static void main(String[] args) {
		//2)번 비밀
		// SecretEx.a = 100;
		a = 100;
		
	}// main() end
}// SecretEx end
