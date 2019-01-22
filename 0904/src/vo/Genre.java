package vo;

public class Genre {
	private int no;
	private String name;
	
	public Genre() {
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return no+") " +name; 
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
