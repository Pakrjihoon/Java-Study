package vo;

public class Actor {
	private String name;
	private int height;
	private int weight;
	private String birthPlace;
	private int age;
	
	// 명시적으로 기본생성자 선언
	public Actor() {
		
	}
	
	// 인자 개수에 맞춰 자동으로 생성자 생성 
	// alt + shift + S -> O 
	public Actor(String name, int height, int weight, String birthPlace) {
		super();
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.birthPlace=birthPlace;
	}
	

	// alt + shift + S -> R -> alt+A 그리고 클릭
	// getter & setter 자동생성 
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public String getBirthPlace() {
		return this.birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
