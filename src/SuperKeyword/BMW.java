package SuperKeyword;

public class BMW extends Car {
	
	//super---calling the parent class constructor, method and property(variables)
	
	int minSpeed = 200;

	public BMW() {
		//super(10);//first statement
		super();
		System.out.println("BMW default const....");
	}

	@Override
	public void getMileage() {
		System.out.println("BMW mileage is 18");
		super.getMileage();
		
	}

	public void displaySpeed() {
		System.out.println("BMW speed: " + minSpeed);//200
		System.out.println("Car speed: " + super.minSpeed);//100
	}

}

//can I call grandparent  class using super()?
//no way u cant call the grandparent upto level 1 oly its allowed (Car)

//Car class--default method can be overridden in public method in---- (BMW) 
//Car class--protected method can be overridden in public method in--- (BMW) 
//Car class--public method can be overridden in public method in--- (BMW) 
//Car class--public,protected, default method cant be overridden in private method (BMW) 


					//private
					//   |
					//default
//more restrictive//     |     Less restrictive
					//protected
					//   |
					//public
