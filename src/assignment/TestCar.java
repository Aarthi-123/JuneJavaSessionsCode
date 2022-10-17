package assignment;

public class TestCar {

	public static void main(String[] args) {
		//top up casting
		AeroDynamicInheritance a1 = new BMWInheritance();
		a1.dynamic();//calls BMW
		a1.aero();//individual
//		a1.autoParking(); //ref type check
		
		EngineeringInheritance e1 = new BMWInheritance();
		e1.engineering();//calls from BMW
		e1.engineer();//individual
//		e1.autoParking(); //ref type check

	}

}
