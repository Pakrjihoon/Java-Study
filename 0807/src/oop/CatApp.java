package oop;

public class CatApp {
	
	public static void main(String[] args) {
		
		//Cat클래스를 가지고
		//만들어진 객체의 레퍼런스를 담을 수 
		//있는 객체자료형 지역변수 c1을 선언하고
		
		//new라는 키워드를 통해 
		//heap메모리 영역의 공간을 할당받고
		//Cat클래스의 (기본)생성자를 호출하여
		//Cat객체를 생성후 그 객체의 레퍼런스를
		//c1 변수에 대입
		Cat c1  = new Cat();
		
		c1.name = "하루";
		
		c1.age = 3;
		
		System.out.println("이름? "+c1.name);
		System.out.println("나이? "+c1.age);
		
		
		//Cat객체 생성
		Cat c2 = new Cat();
		
		c2.age = 10;
		c2.name = "나루";
		
		System.out.println(c2.age);
		System.out.println(c2.name);
		
		//객체자료형 Cat클래스형 지역변수
		//c3를 선언하고
		//Cat객체를 생성하여 레퍼런스를 대입
		Cat c3 = new Cat();
		
		//고양이의 나이도 대입
		//고양이의 이름도 대입
		c3.age = 6;
		c3.name = "거루";
		
		//고양이 이름 , 나이 출력
		System.out.println(c3.age);
		System.out.println(c3.name);
		
		
	}//main() end

}//CatApp end
