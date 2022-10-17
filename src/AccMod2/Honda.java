package AccMod2;

import AccMod1.Car;

public class Honda extends Car {

	public static void main(String[] args) {
		
		Honda h = new Honda();
		h.name = "audi";
		h.price = 30;
//		h.color = "red";//you cant access private
//		h.mileage = 8;//you cant access default

	}

}
//bcoz its the different package u have to import the Car class from AccMod1

//different package sub class---u cant access----private and default
//you can access------public, protected