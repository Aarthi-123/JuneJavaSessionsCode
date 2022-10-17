package AccMod1;

public class Truck {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "audi";
		c.price = 30;
//		c.color = "white";//you cant access private property
		c.mileage = 40;

	}

}

//same class non sub class you cant access the private property
//you can access---public, protected and default
