package overloading;

/*
 * 동아리 관리 프로그램에 멤버 
 */

public class Member {
	
	private String name;	//이름
	private String major;	//학과
	private int code;	//학번(ex:17)
	
	// 기본 생성자
	public Member() {
		
	}
	public Member(String name) {
		this(name,18);
	}
	public Member(String name, int code) {
		this(name,"컴퓨터공학과",code);
	}
	public Member(String name, String major, int code) {
		super();
		this.name = name;
		this.major = major;
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
