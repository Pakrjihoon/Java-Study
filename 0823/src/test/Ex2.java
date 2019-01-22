package test;

public class Ex2 {
	public static void main(String[] args) {
		Object[] o = {"쯔위","나연","사나","모모"};
	
		for(int i=0; i<o.length; i++) {
			System.out.println(o[i]);
		}
		System.out.println("----------");
		
		for(Object name: o) {
			System.out.println(name);
		}
	} //main() end
}// Ex2 end
