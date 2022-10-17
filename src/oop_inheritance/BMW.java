package oop_inheritance;

public class BMW extends Car {//BMW extends Car,Truck------error cant have 2 parents
	
	//its calling from TestCar
	
	int speed = 200;
	static int wheels = 2;
	
	//Method Overriding: Poly + Morphism (RunTime/Dynamic)
	//when you have a method in parent class and the same method is in child class
	//1.with the same method name
	//2.same number of parameters with the same sequence
	//3.same return type
	
	@Override //to find methodoverriding method u have to annotate like @Override
	public void start() {
		System.out.println("BMW-----start");
	}
	
	//@Override
	public void engine() {
		System.out.println("BMW----engine");
	}
	
	public void autoParking() {
		System.out.println("BMW-----autoparking");
	}
	
	//static:
		//static method cannot be override bcoz its in separate memory
		//but without @override annotation you can use the same static method from Car in BMW and that is called method hiding
	
	//Parent and child static method is called method hiding
	
	//Method Hiding:
		public static void billing() {
			System.out.println("BMW -- billing");
		}

}
