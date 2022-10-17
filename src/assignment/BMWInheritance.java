package assignment;

public class BMWInheritance extends CarInheritance {
	
	//its calling from TestCar
	
	@Override //to find methodoverriding method u have to annotate like @Override
	public void start() {
		System.out.println("BMW-----start");
	}
	
//	@Override
	public void engine() {
		System.out.println("BMW----engine");
	}
	
	public void autoParking() {
		System.out.println("BMW-----autoparking");
	}
	
	@Override
	public void dynamic() {
		System.out.println("AeroDynamic Inheritance");
	}
	
	@Override
	public void engineering() {
		System.out.println("Engineering Inheritance");
	}

}
