package oop_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		final int i = 10;//constant data
		
		final int days = 7;
		//days=10;
		System.out.println(10 * days);//70 USD
		
		BMW b = new BMW();
		
		b.start();//overridden own property of BMW method will access. It wont access the car start() method. overridden will takes place
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//overridden
		
		System.out.println(b.speed);
		System.out.println(Car.wheels);//its is static variable so they calling thru class name
		
		System.out.println(BMW.wheels);//its is static variable so they calling thru class name
		
		//
		Car c = new Car();
		c.start();//individual
		c.stop();//individual
		c.refuel();//individual
		c.engine();//overridden
		
		Vehicle v4 = new Vehicle();
		v4.engine();
		
		//child class object can be referred by parent class ref variable
		//top/up casting----------eg.cross browser checking
		//top casting--- oly the car object method can access and also the grandparent method can access ---but in BMW you can access oly the
		//overridden method
		//you cannot access the individual method in BMW, there will be the security check, that is called reference type check 
		Car c1 = new BMW();//BMW is obj referred by c1
		c1.start();//calls BMW method
		c1.stop();//access
		c1.refuel();//access
		c1.engine();//access grandparent
//		c1.autoparking();//cannot access bcoz of ref type check it is the individual method in BMW
		
		Vehicle v1 = new BMW();
		v1.engine();

		Vehicle v2 = new Car();
		v2.engine();
		
		//Down casting://u cant do down casting
		//parent class object can be referred by child class reference variable
		
		// BMW b1 = (BMW)new Car();//ClassCastException

		// BMW b2 = (BMW)new Vehicle();//ClassCastException
		
		

	}

}
