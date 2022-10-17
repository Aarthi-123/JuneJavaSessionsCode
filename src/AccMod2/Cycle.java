package AccMod2;

import AccMod1.Car;

public class Cycle {

	public static void main(String[] args) {
		
		Car c = new Car();//you have to import bcoz its different package bcoz Car in AccMod1 package
		c.name="abc";
//		c.price = 60;//you cant access protected
//		c.color = "white";//you cant access the private
//		c.mileage = 70;//you cant access default

	}

}
//different package non sub class--------you cant access private, protected and default
//you can access oly public