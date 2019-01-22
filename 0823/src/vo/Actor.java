package vo;

import java.lang.*;
import java.sql.Date;

public class Actor {
	private String name;
	private int age, height, weight;
	
	public Actor() {
		super();
	}
	public String getName() {
		return name;
	}
	public Actor(String name, int age, int height, int weight) {	
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// toString 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : "+name+" / 나이 : "+age+"살"+" / 키 : "+height+"cm"+" / 몸무게 : "+weight+"kg";
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
