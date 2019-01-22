package animal;

public class AHApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] wards = new Animal[5];
		
		wards[0] = new Cat();
		wards[1] = new Gorilla();
		wards[2] = new Zebra();
		wards[3] = new Cat();
		wards[4] = new Hippo();
		
		for(Animal ani : wards) {
			ani.cry();
		}
	} // main() end

} // AHApp end
