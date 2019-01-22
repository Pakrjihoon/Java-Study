package random;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		/*
		 * 자바에서도 자바스크립트에서 배운
		 * (Math.floor(Math.random)*갯수)+시작수 가 가능하지만
		 * Random 클래스 활용
		 * 
		 * nextInt(갯수)
		 */
		Random rnd = new Random();
		int num = rnd.nextInt(5)+1;
		System.out.println(num);
	} 
}
