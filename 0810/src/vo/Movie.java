package vo;

public class Movie {
	// VO 만드는 규칙
	// 멤버필드를 private으로 선언한다. (은닉화)
	private String name;
	// 메서드로 접근해서 값을 얻고 값을 저장한다
	// setter , getter 
	
	private int runningTime;
	private String genre;

	// name의 getter 
	public String getName() {
		return this.name; //instance 멤버들끼리 접근시 this 생략가능
	}
	
	// name의 setter 
	public void setName(String name) {
		this.name = name;
	}
	
	// runningTime의 getter
	public int getRunningTime() {
		return this.runningTime;
	}
	// runningTime의 setter
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	// genre의 getter
	public String getGenre() {
		return this.genre;
	}
	// genre의 setter
	public void setGenre(String genre) {
		this.genre=genre;
	}
}
