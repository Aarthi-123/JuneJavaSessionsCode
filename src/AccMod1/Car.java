package AccMod1;

public class Car {
	
	//view the image
	
	public String name;
	protected int price;
	private String color;
	int mileage;
	
	//class vars+ methods
	public static void main(String[] args) {

		 int i = 10;
		
		
		Car c = new Car();
		c.name = "bmw";
		c.price = 20;
		c.color = "red";
		c.mileage = 10;
		
		
		
	}

}

//same class u can access any modifiers------------------------public,protected,private and default
//Access modifiers only work in class variables
//static used only in class variables
//final u can create in class and also in main method
//inside the main method oly local variable will be allowed
