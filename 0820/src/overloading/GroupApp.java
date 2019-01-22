package overloading;

public class GroupApp {
	
	public static void main(String[] args) {
		
		// 황정민 컴퓨터공학과 18학번
		Member m1 = new Member("황정민");
		System.out.println(m1.getName());
		System.out.println(m1.getMajor());
		System.out.println(m1.getCode());
		
		// 주지훈 컴퓨터공학과 18학번
		Member m2 = new Member("주지훈");
		System.out.println(m2.getName());
		System.out.println(m2.getMajor());
		System.out.println(m2.getCode());
		
		// 강동원 컴퓨터공학과 17학번
		Member m3 = new Member("강동원",17);
		System.out.println(m3.getName());
		System.out.println(m3.getMajor());
		System.out.println(m3.getCode());
		
		// 하정우 심리학과 16학번
		Member m4 = new Member("하정우","심리학과",16);
		System.out.println(m4.getName());
		System.out.println(m4.getMajor());
		System.out.println(m4.getCode());
		
	} // main() end
} //GroupApp end
