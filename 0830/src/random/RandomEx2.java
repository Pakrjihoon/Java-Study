package random;

import java.util.Random;

public class RandomEx2 {
	public static void main(String[] args) {
		Random rnd = new Random();
		for(int i =1; i<11; i++) {
			System.out.println(rnd.nextInt(6)+5);
		}
	}
}

