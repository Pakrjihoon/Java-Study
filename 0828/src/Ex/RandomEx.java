package Ex;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
	String[] names = 
		{
				"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21",
		};
	Random ran = new Random();
	int ranNum = ran.nextInt(21);
	System.out.println(names[ranNum]);
	}	
}
