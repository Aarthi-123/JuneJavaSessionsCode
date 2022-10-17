package junesessions;

public class CarTypeStaticVariable {

	//static can be used oly in variables and in methods only applied inside the class...
	//If we use any variables other than class it will consider as a local variables
	
	//to use static method  always call thru class name
	//for non static method you have to create an object
	
	//instance variables-------object class variables----global scope
	//local variables-------limited to methods---like block scope
	
	String name;
	int price;
	String plateNumber;
//	int wheels = 4;
	static int wheels = 4;//for all the 3 objects the common variable is 4 wheels bcoz all the cars have 4 wheels,
						 //so we are using the static int wheels = 4;
	
	public static void main(String[] args) {
//		static int i = 10;// it will show error static variable and method oly applied inside the class
		int i = 10;//local var--- inside the method always act like a local var
		
		CarTypeStaticVariable c1 = new CarTypeStaticVariable();
		c1.name = "BMW";
		c1.price = 75;
		c1.plateNumber = "KA052222";
		
		
		CarTypeStaticVariable c2 = new CarTypeStaticVariable();
		c2.name = "Audi";
		c2.price = 60;
		c2.plateNumber = "KA053212";
		
		CarTypeStaticVariable c3 = new CarTypeStaticVariable();
		c3.name = "Honda";
		c3.price = 20;
		c3.plateNumber = "KA059090";
		
		//Static will be used oly in variables and methods
		
		//How to access the static variable:
		//1.use the class name
		System.out.println(CarTypeStaticVariable.wheels);
		
		//2.direct access:
		System.out.println(wheels);//this method prefer oly working in the same class
		
		//3.can the static vars can access thru object reference?
		System.out.println(c1.wheels);//it will show warning---- Not recommended
		
		
		
		//objects are stored in heap and object reference name stored in stack memory..
		//static variable and static method stored in CMA-common memory allocation pool and it also called permanent generation
		//this permanent generation name is called before JDK 1.7 
		//After JDK 1.8 version it is called as Metaspace 
		
		//difference b/w permanent generation and Metaspace?
		//In permanent generation is a static memory allocation, if it goes beyond 100MB for example , it will the clear the static variable and method manually
		//and to delete no work of garbage collector
		//In Metaspace it is a dynamic memory allocation, if it goes beyond 100MB it will automatically take space from RAM 
		
		//Main method also static so it will stored in CMA
		//who is calling the main method?
		//JVM will call directly no need to create object 
		
//		Characteristics of Static Methods
//		A static method can access static methods and variables as follows:
//		A static method can call only other static methods; it cannot call a non-static method
//		A static method can be called directly from the class, without having to create an instance of the class
//		A static method can only access static variables; it cannot access instance variables
//		Since the static method refers to the class, the syntax to call or refer to a static method is: class name.method name
//		To access a non-static method from a static method, create an instance of the class
		
//		Characteristics of Non-Static Methods
//		A non-static method in Java can access static methods and variables as follows:
//		A non-static method can access any static method without creating an instance of the class
//		A non-static method can access any static variable without creating an instance of the class because the static variable belongs to the class
	}

}
