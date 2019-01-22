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
		
		for(Animal animal : wards) {
			
			animal.cry();
//			if(animal instanceof Hippo) {
//				Hippo hippo = (Hippo) animal;
//				hippo.cry();
//			} else if(animal instanceof Cat) {
//				Cat cat = (Cat)animal;
//				cat.cry();
//			} else if(animal instanceof Gorilla) {
//				Gorilla gorilla = (Gorilla)animal;
//				gorilla.cry();
//			} else if(animal instanceof Zebra) {
//				Zebra zebra = (Zebra)animal;
//				zebra.cry();
//			} 
		}
	} // main() end

} // AHApp end
