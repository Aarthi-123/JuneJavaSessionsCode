package oop_interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	
	//child cannot have multiple parents it will solved thru Interface
	//Interface is not a class
	//FortisHospital child class should implement all the method from parent interfaces(USmedical, Ukmedical,Indian medical)
	//we have to implement each and every method in child class(fortishospital)
	
	//class to class------extends
	//class to interface----implements
	//interface to interface----extends
	
	//Individual
	public void pathologyServices() {
		System.out.println("FH------pathologyServices");
	}
	
	public void OPDServices() {
		System.out.println("FH-------OPDServices");
	}
	
	//USA
	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
		
	}

	@Override
	public void OrthoServices() {
		System.out.println("FH -- OrthoServices");
		
	}
	
	// common interface method
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
		
	}
	
	//Method Overriding + Method Overloading
	//both are possible in interfaces
	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices(int dentists) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int dentalServices(int dentists, String dentalMachine) {
		// TODO Auto-generated method stub
		return 100;
	}
	
	//UK
	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
		
	}
	
	//Indian

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");
		
	}
	
	//WHO
	@Override
	public void covid19News() {
		System.out.println("FH -- covid19News");
		
	}

	@Override
	public void covid19Vaccination() {
		System.out.println("FH -- covid19Vaccination");
		
	}
	
	//method hiding:
	public static void medicalTraining() {//static method cannot be override its is called method hiding
		System.out.println("USMedical----------medicalTraining");
	}
	
	//can we override the default method from interface?
	//Ans:yes
	@Override
	public void donation() {//but here have to public not default, bcoz default can be used oly in interface
		System.out.println("FH------donation");
	}

}
